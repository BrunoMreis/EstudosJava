package br.com.alura.servidor;

import java.io.PrintStream;

public class ComandoC1 implements Runnable {

	private PrintStream saida;

	public ComandoC1(PrintStream saida) {
		this.saida = saida;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execultando comando c1!");

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException (e);
		}

		this.saida.println("Comando c1 execultado com sucesso");
	}

}
