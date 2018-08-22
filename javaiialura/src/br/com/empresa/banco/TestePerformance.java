package br.com.empresa.banco;

import java.util.LinkedList;
import java.util.List;

public class TestePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Iniciando...");
		List<Integer> teste = new LinkedList();
		long inicio = System.currentTimeMillis();

		int total = 3000000;

		for (int i = 0; i < total; i++) {

			teste.add(0,i);

		}

//		for (int i = 0; i < total; i++) {
//
//			teste.contains(i);
//		}

		long fim = System.currentTimeMillis();

		double tempo = (fim - inicio)/1000.0;

		System.out.println("Tempo gasto: " + tempo);

	}

}
