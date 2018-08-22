package br.com.empresa.banco.conta;

public class ValorInvalidoExption extends Exception {

	public ValorInvalidoExption(double valor) {
		super("Valor Invalido: " + valor);

	}
}
