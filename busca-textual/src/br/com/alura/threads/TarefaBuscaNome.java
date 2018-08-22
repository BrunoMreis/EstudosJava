package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {

	private String nome;
	private String nomeArquivo;

	public TarefaBuscaNome(String nomeArquivo, String nome) {
		this.nome = nome;
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));

			int numerolinha = 1;

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();

				if (linha.matches(nome)) {
					System.out.println(nomeArquivo + "---" + numerolinha + "---" + linha);
					
				}
				numerolinha++;
			}
			
			scanner.close();

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
