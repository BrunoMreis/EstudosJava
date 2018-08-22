package br.com.alura.bytebank.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.alura.bytebank.modelo.Cliente;
import br.com.alura.bytebank.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

			Cliente cliente = new Cliente("Bruno","33655555","DEV");
			
			ContaCorrente cc = new ContaCorrente(225, 1455);
			cc.setTitular(cliente);
			cc.deposita(2354.5);
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
			oos.writeObject(cc);
			
			oos.close();
			
	}

}
