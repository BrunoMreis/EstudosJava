package br.com.desconto;

public class DescontoOcamentoMaiorQuinhentos implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.00) {
			return orcamento.getValor() * 0.07;
		}else {
			return proximo.desconta(orcamento);
		}
		
		
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		this.proximo = proximo;

	}

}
