package br.com.alura.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class TarefaServidor {

	private AtomicBoolean estaRodando;
	private ServerSocket servidor;
	private ExecutorService threadPool;
	private BlockingQueue<String> filaComandos;

	public TarefaServidor() throws IOException {
		System.out.println("====>>>Iniciando Servidor<<<====");
		this.servidor = new ServerSocket(12345);
		this.threadPool = Executors.newFixedThreadPool(4, new FabricaDeThread());
		this.estaRodando = new AtomicBoolean(true);
		this.filaComandos = new ArrayBlockingQueue<>(2);
		iniciarConsumidores();
	}
	
	private void iniciarConsumidores() {
	    int qtdCondumidores = 2;
	    for (int i = 0; i < qtdCondumidores; i++) {
	        TarefaConsumir tarefa = new TarefaConsumir(filaComandos);
	        this.threadPool.execute(tarefa);
	    }
	}


	public void rodar() throws IOException {

		while (this.estaRodando.get()) {

			try {

				Socket socket = servidor.accept();
				System.out.println("Aceitando novo cliente na porta: " + socket.getPort());
				DistribuirTarefas distribuidorTarefas = new DistribuirTarefas(threadPool, filaComandos, socket, this);
				threadPool.execute(distribuidorTarefas);

			} catch (SocketException e) {
				System.out.println("SocketException, está rodando? " + this.estaRodando);

			}

		}

	}

	public void parar() throws IOException {
		System.out.println("Parando o SERVIDOR");
		this.estaRodando.set(false);
		this.threadPool.shutdown();
		this.servidor.close();

	}

	public static void main(String[] args) throws IOException {

		TarefaServidor servidor = new TarefaServidor();
		servidor.rodar();

	}

}
