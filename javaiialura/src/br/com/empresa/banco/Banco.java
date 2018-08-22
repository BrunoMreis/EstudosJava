package br.com.empresa.banco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco {
	
	List contas = new LinkedList <Conta>();
	private Map<String, Conta> indexadoPorNome = new HashMap<>();
	
	public void adiciona(Conta c) {
		contas.add(c);
		indexadoPorNome.put(c.getNome(), c);
		
	}
	
	public Conta pega(int x) {
		
		return (Conta) contas.get(x);
	}

	public int pegoQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPornoNomes(String nome) {
		return indexadoPorNome.get(nome);
		
	}
}
