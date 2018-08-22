package br.com.alura.banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		//Passando a tarefa e o nome do Thread
		

		Thread convidado1 = new Thread(new Tarefa1(banheiro),"João");
		Thread convidado2 = new Thread(new Tarefa2(banheiro),"Pedro");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
		limpeza.setDaemon(true);

//		Thread convidado3 = new Thread(new Tarefa1(banheiro));
//		Thread convidado4 = new Thread(new Tarefa2(banheiro));
	
		convidado1.start();
		convidado2.start();
		limpeza.start();
		
	
	}

}
