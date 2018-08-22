package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoExption;
import javaiialura.Tributavel;

public class TesteTributa {
	
	public static void main(String[] args) throws ValorInvalidoExption {
		ContaCorrente contacorrente = new ContaCorrente();
		contacorrente.deposita(1120);
		System.out.println(contacorrente.calculaTributos());
		
		Tributavel t = contacorrente;
		System.out.println(t.calculaTributos());
		
		System.out.printf("Imprime saldo: %.2f",contacorrente.getSaldo());
//		System.out.println(t.getSaldo());
		
		
		
	}
}
