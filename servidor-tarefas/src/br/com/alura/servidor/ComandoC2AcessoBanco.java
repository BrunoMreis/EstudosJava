package br.com.alura.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class ComandoC2AcessoBanco implements Callable<String> {

	private PrintStream saida;

	public ComandoC2AcessoBanco(PrintStream saida) {
		this.saida = saida;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Servidor recebeu comando C2 - AcessoBanco");
		saida.println("Processando comando C2 - AcessoBanco");

		Thread.sleep(15000);
		int numero = new Random().nextInt(100) + 1;
		System.out.println("Servidor Finalizou C2- AcessoBanco");

		return Integer.toString(numero);
	}

}
