package br.com.empresa.banco;

import java.util.TreeSet;

public class TesteTreeset {

	public static void main(String[] args) {
		TreeSet<Integer> teste = new TreeSet<>();
		for (int i = 0; i < 1000; i++) {
			teste.add(i);
			
		}
		
	for (Integer integer : teste.descendingSet()) {
		
		System.out.println(integer + " ");
		
	}
	}
	
	

}
