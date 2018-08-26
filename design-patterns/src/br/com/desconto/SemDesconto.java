package br.com.desconto;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		//Sem desconto 
	}

}
