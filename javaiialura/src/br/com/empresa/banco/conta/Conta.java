package br.com.empresa.banco.conta;

public abstract class Conta {
	protected int numero;
	protected double saldo;
	protected String nome;

	public void deposita(double saldo) throws ValorInvalidoExption {
		if (saldo < 0) {
			throw new ValorInvalidoExption(saldo);
		} else {
			this.saldo += saldo;
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(int saca) {
		if (this.saldo >= saca && saca > 0) {
			this.saldo -= saca;
		} else
			System.out.println("Saque não realizado!");
	}

	abstract public void atualiza(double taxa);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esse objeto é uma conta\n" + "Com Saldo: R$" + this.saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}////////////// fim//////////////////
