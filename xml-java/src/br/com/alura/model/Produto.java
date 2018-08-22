package br.com.alura.model;

public class Produto {
	
	
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		// TODO Auto-generated constructor stub
	}

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	  @Override
	    public String toString() {
	        return "Nome:"+ this.nome + "\n Preço:" + this.preco +"\n";
	    }


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
