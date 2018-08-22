package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

//		String linha = scanner.nextLine();

		while (scanner.hasNext()) {

//			System.out.println(scanner.nextLine());

			Scanner linhaScanner = new Scanner(scanner.nextLine());
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format(new Locale("pt-BR"), "%s - %d-%d, %s: %08.2f %n", tipoConta, agencia, numeroConta, titular,saldo);

			linhaScanner.close();

		}

		scanner.close();

	}

}
