package br.com.alura.bytebank.teste.util;

import java.util.List;
import java.util.Vector;

import br.com.alura.bytebank.modelo.Conta;
import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		List<Conta> lista = new Vector<Conta>();

		ContaCorrente cc1 = new ContaCorrente(22, 11);

		// cria instância de ContaPoupanca
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
//		Cliente cliente = new Cliente();
//		lista.add(3, cliente);
		lista.add(cc1);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		System.out.println(lista.get(0));
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		ContaCorrente cc3 = new ContaCorrente(253, 783);
		ContaCorrente cc4 = new ContaCorrente(253, 783);
		lista.add(cc3);
		

		System.out.println("Tamanho: " + lista.size());
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("Lista contêm c4? "+ lista.contains(cc4));
		
	}

}
