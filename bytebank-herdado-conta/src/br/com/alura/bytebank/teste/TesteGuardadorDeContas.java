package br.com.alura.bytebank.teste;

import br.com.alura.bytebank.modelo.Conta;
import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.GuardadorDecontas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuardadorDecontas guardadorDecontas = new GuardadorDecontas();

		ContaCorrente contaCorrente1 = new ContaCorrente(22, 11);
		ContaCorrente contaCorrente2 = new ContaCorrente(22, 22);

		guardadorDecontas.adiciona(contaCorrente1);
		guardadorDecontas.adiciona(contaCorrente1);

		int quantidade = guardadorDecontas.getTamanho();
		
		System.out.println(quantidade);
		
		System.out.println( guardadorDecontas.getConta(-1).getNumero());
		
		
	}

}
