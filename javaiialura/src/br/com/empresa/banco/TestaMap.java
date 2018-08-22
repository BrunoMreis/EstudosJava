package br.com.empresa.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoExption;

public class TestaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaCorrente();

		try {
			conta1.deposita(10000);
			conta2.deposita(3000);
		} catch (ValorInvalidoExption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// cria Map
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

		// Adiciona duas chave ao seu valor

		mapaDeContas.put("diretor", conta1);
		mapaDeContas.put("Gerente", conta2);

		// Qual é a conta diretor?

		Conta contaDoDiretor =  mapaDeContas.get("diretor");
		System.out.println("conta do diretor saldo: " + contaDoDiretor.getSaldo());

	}

}
