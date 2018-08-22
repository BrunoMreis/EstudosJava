package br.com.alura.servidor;

import java.io.PrintStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;



public class JuntaResultadoWSeBD implements Callable<Void> {

	private Future<String> futureWS;
	private Future<String> futureBD;
	private PrintStream saidaCliente;

	public JuntaResultadoWSeBD(Future<String> futureWS, Future<String> futureBD, PrintStream SaidaCliente) {
		this.futureWS = futureWS;
		this.futureBD = futureBD;
		saidaCliente = SaidaCliente;
	}

	@Override
	public Void call() throws Exception {
		System.out.println("Aguardando Resultado Futuro de WS e BD");

		try {
			String numeroMagico1 = futureBD.get(16, TimeUnit.SECONDS);
			String numeroMagico2 = futureWS.get(16, TimeUnit.SECONDS);

			this.saidaCliente.println("Numero Magico: " + numeroMagico1 + "," + numeroMagico2);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			
			System.out.println("Timeout: Cancelando a execução do comando c2");

			this.futureWS.cancel(true);
			this.futureBD.cancel(true);

			this.saidaCliente.println("Timeout na execução do comando c2");
		}
		
		
		System.out.println("Finalizou JuntaResultadosFutureWSFutureBanco");
		
		return null;
	}

}
