package br.com.empresa.banco;

import java.util.HashSet;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TesteContaHshSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Conta> contas = new HashSet<>();
		
		ContaCorrente c1 = new ContaCorrente(114,"Maria");
		ContaCorrente c2 = new ContaCorrente(333,"Jaqueline");
		ContaCorrente c3 = new ContaCorrente(222,"Bruno");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		
		System.out.println("Quantidades de contas: "+ contas.size());
		
		

	}

}
