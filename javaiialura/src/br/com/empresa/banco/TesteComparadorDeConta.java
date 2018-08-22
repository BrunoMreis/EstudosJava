package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TesteComparadorDeConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta1 = new ContaCorrente();
		conta1.setNumero(10);
		
		Conta conta2 = new ContaCorrente();
		conta2.setNumero(11);
		
		
		if(conta1.equals(conta2)) {
			System.out.println("Contas Iguais");
		}else System.out.println("Contas Diferentes");
		

	}

}
