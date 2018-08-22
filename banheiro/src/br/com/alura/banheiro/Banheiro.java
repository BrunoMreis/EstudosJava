package br.com.alura.banheiro;

public class Banheiro {

	private Boolean estaSujo = true;

	synchronized public void fazNumero1() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " " + "Etrando no BANHERO");

		{
			while (this.estaSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + " " + "Fazendo coisa rápida!");

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(nome + " " + "Lavando as mãos");
			this.estaSujo = true;
			System.out.println(nome + " " + "Dando descarga!");
			System.out.println(nome + " " + "Saindo.");

		}
	}

	synchronized public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " " + "Etrando no BANHERO");

		{
			while (this.estaSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + " " + "Fazendo coisa demorada!");

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(nome + " " + "Lavando as mãos");
			this.estaSujo = true;
			System.out.println(nome + " " + "Dando descarga!");
			System.out.println(nome + " " + "Saindo.");
		}

	}

	public void esperaLaFora(String nome) {

		System.out.println(nome + ", eca, Está sujo!");

		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	synchronized public void limpa() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " " + "Etrando no BANHERO");

		{
			while(!estaSujo) {
				System.out.println(nome + ", Não está sujo!, vou sair");
			}
			System.out.println(nome + " " + "Limpando o banheiro");
			this.estaSujo = false;
			try {
				Thread.sleep(13000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(nome + " " + "Saindo.");
			this.notifyAll();
			
		}
	}

}
