package br.com.empresa.banco;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TesteOrdenacao {

	
	public static <T> void main(String[] args) {
		Random valor = new Random(); 
		Conta contaCorrente = new ContaPoupanca();
		contaCorrente.setNome("Charlene");
		contaCorrente.setNumero(valor.nextInt(100));
		contaCorrente.setSaldo(valor.nextInt(9999999)+ valor.nextDouble());
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNome("Raniele");
		contaPoupanca.setNumero(valor.nextInt(100));
		contaPoupanca.setSaldo(valor.nextInt(9999999)+ valor.nextDouble());
		
		Conta contaCorrente1 = new ContaPoupanca();
		contaCorrente1.setNome("Bruno");
		contaCorrente1.setNumero(valor.nextInt(100));
		contaCorrente1.setSaldo(valor.nextInt(9999999)+ valor.nextDouble());
		
		Conta contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setNome("Vila");
		contaPoupanca2.setNumero(valor.nextInt(100));
		contaPoupanca2.setSaldo(valor.nextInt(9999999)+ valor.nextDouble());
		
		List<Conta> contas = new ArrayList<>();
		
		contas.add(contaCorrente);
		contas.add(contaCorrente1);
		contas.add(contaPoupanca);
		contas.add(contaPoupanca2);
		
//		for (Conta conta : contas) {
//			System.out.println(conta);
//		}
//		
		Collections.sort((List) contas);
//		Collections.reverse(contas); 
		
		System.out.println("Ordenado");
		for (Conta conta : contas) {
			System.out.println(conta);
			System.out.println(conta.getNome());
		}
	}

}
