package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteArrayList {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> teste = new ArrayList();
		for (int i = 0; i < 1000; i++) {
			teste.add(i);
			
		}
		Collections.reverse(teste);
		
	for (Integer integer : teste) {
		
		System.out.println(integer + " ");
		
	}
	}

}
