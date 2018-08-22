package br.com.alura.banheiro;

public class Tarefa1 implements Runnable {
	
	Banheiro banheiro;
	
	
	public Tarefa1(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.fazNumero1();

	}

}
