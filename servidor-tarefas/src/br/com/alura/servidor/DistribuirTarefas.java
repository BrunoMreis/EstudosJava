package br.com.alura.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable {

	private Socket socket;
	private TarefaServidor servidor;
	private ExecutorService threadPool;
	private BlockingQueue<String> filaComandos;

	public DistribuirTarefas(ExecutorService threadPool, BlockingQueue<String> filaComandos, Socket socket,
			TarefaServidor servidor) {
		this.threadPool = threadPool;
		this.filaComandos = filaComandos;
		this.socket = socket;
		this.servidor = servidor;

	}

	@Override
	public void run() {

		System.out.println("Distribuindo as tarefas" + socket);

		try {
			Scanner entradaCliente = new Scanner(socket.getInputStream());
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());

			while (entradaCliente.hasNextLine()) {

				String comando = entradaCliente.nextLine();
				System.out.println("Comando recebido " + comando);

				switch (comando) {
				case "c1":
					// confirmação do o cliente
					saidaCliente.println("Confirmação do comando c1");
					ComandoC1 c1 = new ComandoC1(saidaCliente);
					threadPool.execute(c1);
					break;

				case "c2":
					saidaCliente.println("Confirmação do comando c2");
					// ComandoC2 c2 = new ComandoC2(saidaCliente);
					ComandoC2AcessoBanco c2Banco = new ComandoC2AcessoBanco(saidaCliente);
					ComandoC2ChamaWS c2WS = new ComandoC2ChamaWS(saidaCliente);

					Future<String> futureBanco = threadPool.submit(c2Banco);
					Future<String> futureWS = threadPool.submit(c2WS);
					Callable<Void> juntaResultado = new JuntaResultadoWSeBD(futureWS, futureBanco, saidaCliente);

					this.threadPool.submit(juntaResultado);

					break;

				case "c3":
					try {
						this.filaComandos.put(comando);
						saidaCliente.println("Comando c3 adicionado na fila");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return;

				case "fim":
					saidaCliente.println("Deslingando o SERVIDOR");
					this.servidor.parar();
					return;

				default:
					saidaCliente.println("Comando não encontrado");

				}

				System.out.println(comando);
			}

			entradaCliente.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
