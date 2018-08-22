package br.com.alura.bytebank.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int pos;

	public GuardadorDeReferencias() {

		this.referencias = new Object[10];

	}

	public void adiciona(Object conta) {

		this.referencias[pos] = conta;
		this.pos++;
	}

	public int getTamanho() {

		return this.pos;
	}

	public Object getReferencia(int i) {
		if(i > this.pos || i < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return this.referencias[i];
	}

}
