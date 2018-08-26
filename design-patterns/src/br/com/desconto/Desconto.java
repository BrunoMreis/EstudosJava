package br.com.desconto;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void proximoDesconto(Desconto proximo);

}
