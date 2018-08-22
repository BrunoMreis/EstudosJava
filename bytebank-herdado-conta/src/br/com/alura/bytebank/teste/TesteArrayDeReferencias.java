package br.com.alura.bytebank.teste;


import br.com.alura.bytebank.modelo.Conta;
import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

    public static void main(String[] args) {

    	 // alterando o tipo
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        // cria instância de ContaPoupanca
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;    

        System.out.println(contas[1].getNumero()  );

        // alterou o tipo, realizando o cast
        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
