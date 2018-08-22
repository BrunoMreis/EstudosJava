package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteInvocaMetodoSemParametro {

	public static void main(String[] args) throws Exception {
		Class<?> subControleClasse =
				Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		
		Constructor<?> construtorPadrao = subControleClasse.getDeclaredConstructor();
		construtorPadrao.setAccessible(true);
		
		Object subControle = construtorPadrao.newInstance();
		
		for (Method m : subControleClasse.getMethods()) {
			System.out.println(m);
		}
		
		System.out.println();
		
		for (Method m : subControleClasse.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		System.out.println();
		
		Method m = subControleClasse.getDeclaredMethod("metodoSubControle1");
		m.setAccessible(true);
		
		Object retorno = m.invoke(subControle);
		
		System.out.println(retorno);
	}

}
