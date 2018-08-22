package br.com.alura.servidor;

import java.io.PrintStream;

public class ComandoC2 implements Runnable{
	
	private PrintStream saida;
	
	
	
	public ComandoC2(PrintStream saida) {
		this.saida = saida;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execultando comando c2!");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException (e);
		}
//		throw new RuntimeException("problema no comando c2");
		this.saida.println("Comando c2 execultado com sucesso");
	}

}
