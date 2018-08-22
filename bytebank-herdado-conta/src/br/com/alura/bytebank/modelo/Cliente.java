package br.com.alura.bytebank.modelo;

import java.io.Serializable;

/**
 * Clase representa um cliente.
 * 
 * @author bruno
 *
 */

public class Cliente implements Serializable{

	private String nome;
	private String cpf;
	private String profissao;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do Cliente: "+ this.nome + ", CPF: " +this.cpf+", Profissão: " + this.profissao;
	}

}
