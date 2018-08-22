package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoExption;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String[] ss = new String[Integer.MAX_VALUE];
		} catch (OutOfMemoryError e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		try {
			c.deposita(-1000);
			cc.deposita(-1000);
			cp.deposita(-1000);

		} catch (ValorInvalidoExption e) {
			System.out.println(e.getMessage());
		}
		// c.atualiza(0.01);
		// cc.atualiza(0.01);
		// cp.atualiza(0.01);

		// System.out.println(c.getSaldo());
		// System.out.println(cc.getSaldo());
		// System.out.println(cp.getSaldo());

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
		
		Conta conta = new ContaCorrente();
		
		System.out.println(conta);
	}

}
