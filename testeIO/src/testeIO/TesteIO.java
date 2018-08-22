package testeIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteIO {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/arquivo.txt")));

		// System.out.println("Digite sua mensagem: ");
		try {
			String linha = br.readLine();
			do {
				System.out.println(linha);
				linha = br.readLine();
			} while (linha != null);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
