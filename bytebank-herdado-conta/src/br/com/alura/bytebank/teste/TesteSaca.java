package br.com.alura.bytebank.teste;

import br.com.alura.bytebank.modelo.Conta;
import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.SaldoInsulficienteException;


public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new ContaCorrente(123, 321);
		
		try {
			c.saca(100);
		} catch (SaldoInsulficienteException e) {
			System.out.println("Exeption: "+ e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Saldo disponivel: " + c.getSaldo());
	}

}
