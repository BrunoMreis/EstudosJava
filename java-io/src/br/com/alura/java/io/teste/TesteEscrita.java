package br.com.alura.java.io.teste;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Teste TesteTesteTesteTesteTesteTesteTesteTesteTeste");
		bw.newLine();
		bw.newLine();
		bw.write("Teste TesteTesteTesteTesteTesteTesteTesteTesteTeste");
		
		
		bw.close();
	}

}
