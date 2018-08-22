package br.com.alura.bytebank.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.alura.bytebank.modelo.ContaCorrente;

public class TesteDeserializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("conta.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();

        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular().getNome());

    }

}