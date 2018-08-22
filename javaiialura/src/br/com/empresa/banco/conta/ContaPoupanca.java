package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<Conta> {

	// public void atualiza(double taxa) {
	// this.saldo += (this.saldo * taxa);
	// }

	public void deposita(double valor) throws ValorInvalidoExption {
		if (valor > 0) {
			throw new ValorInvalidoExption(valor);
		} else {
			this.saldo += (valor - 0.1);
		}
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa * 2);
	}

//	@Override
//	public int compareTo(Conta outraconta) {
//		if (this.nome < outraconta.getNome()) {
//			return -1;
//		}
//
//		if (this.nome > outraconta.getNome()) {
//			return 1;
//		}
//
//		return 0;
//	}
	
	@Override
	public int compareTo(Conta outraconta) {
		return this.nome.compareTo(outraconta.nome);	

	}
}
