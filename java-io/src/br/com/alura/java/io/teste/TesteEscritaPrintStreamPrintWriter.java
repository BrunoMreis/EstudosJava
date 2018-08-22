package br.com.alura.java.io.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintStream ps = new PrintStream("Lorem2.txt","UTF-8");
		
		
		ps.println("Bruno");
		ps.println();
		ps.println();
		ps.println("TEste teste");
		ps= System.out;
		ps.close();

	}

}
