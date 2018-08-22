package br.com.alura.bytebank.teste;

import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.ContaPoupanca;
import br.com.alura.bytebank.modelo.SaldoInsulficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsulficienteException {
					
		ContaCorrente cc = new ContaCorrente(1, 111);
		cc.deposita(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(100.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		System.out.println(cp);
		System.out.println(cc);
		
		

	}

}
