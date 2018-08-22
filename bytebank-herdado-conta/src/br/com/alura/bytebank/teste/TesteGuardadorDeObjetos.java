package br.com.alura.bytebank.teste;

import br.com.alura.bytebank.modelo.Cliente;
import br.com.alura.bytebank.modelo.Conta;
import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		ContaCorrente contaCorrente1 = new ContaCorrente(22, 11);
		ContaCorrente contaCorrente2 = new ContaCorrente(22, 22);
		Object cliente = new Cliente("Bruno", "10000000", "Eng.computação");

		guardador.adiciona(contaCorrente1);
		guardador.adiciona(contaCorrente1);
		guardador.adiciona(cliente);

		int quantidade = guardador.getTamanho();

		System.out.println(quantidade);

		System.out.println("Numero da Conta: " + ((Conta) guardador.getReferencia(0)).getNumero());
		System.out.println(guardador.getReferencia(2));

	}

}
