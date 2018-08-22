package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerialicaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		
//		Cliente cliente = new Cliente("Bruno Moreira Reis", "36623554858", "Egenheiro");
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		
		System.out.println(((Cliente)ois.readObject())
				.getCpf());
		
		ois.close();
		
		
		
	}

}
