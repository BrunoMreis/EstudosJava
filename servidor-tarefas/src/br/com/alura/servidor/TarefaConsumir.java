package br.com.alura.servidor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TarefaConsumir implements Runnable {

	private BlockingQueue<String> filaComando;

	public TarefaConsumir(BlockingQueue<String> filaComandos) {
		this.filaComando = filaComandos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String comando = null;
		try {

			while ((comando = this.filaComando.take()) != null) {
				System.out.println("Consumindo comando: " 
						+ comando + ", " + Thread.currentThread().getName());
				Thread.sleep(5000);

			}

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}

}
