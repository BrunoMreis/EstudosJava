package br.com.alura.bytebank.modelo;

public class GuardadorDecontas {

	private Conta[] contas;
	private int pos;

	public GuardadorDecontas() {

		this.contas = new Conta[10];

	}

	public void adiciona(Conta conta) {

		this.contas[pos] = conta;
		this.pos++;
	}

	public int getTamanho() {

		return this.pos;
	}

	public Conta getConta(int i) {
		if(i > this.pos || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		return this.contas[i];
	}

}
