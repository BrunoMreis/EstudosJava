package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoExption;
import javaiialura.GerenciadorDeImpostoDeRenda;
import javaiialura.SeguroDeVida;

public class TesteGerenciadorDeImpostos {

	public static void main(String[] args) throws ValorInvalidoExption {
		// TODO Auto-generated method stub

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adicina(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adicina(cc);
		
		System.out.printf("Imprime: %.2f", cc.getSaldo());
		System.out.println(gerenciador.getTotal());
		

	}

}
