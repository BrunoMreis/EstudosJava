package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "(Dan|Jon)(\\s|\\w)*";

		Thread threadAutor = new Thread(new TarefaBuscaNome("autores.txt",nome));
		Thread threadAssinatura1 = new Thread(new TarefaBuscaNome("assinaturas1.txt",nome));
		Thread threadAssinatura2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nome));
		
		
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAutor.start();

	}

}
