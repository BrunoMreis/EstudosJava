package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

//		fw.write("!");
//		fw.write(System.lineSeparator());
//		fw.write("\r\n");
//		fw.write("ssdsdsd! \r\n");
//		fw.write("Teste");

		bw.write("Bruno Franscisclaiton!");
		bw.newLine();
		bw.newLine();
		bw.write("Casa amarela ! \r\n");
		bw.write("Teste");

		

		bw.close();

	}

}
