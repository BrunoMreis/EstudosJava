package br.com.desconto;

public class DescontoMaisDeCincoIntens implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else
			return proximo.desconta(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		this.proximo = proximo;
	}

}
