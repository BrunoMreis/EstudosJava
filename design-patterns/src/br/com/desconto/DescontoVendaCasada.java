package br.com.desconto;

public class DescontoVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (existe("LAPIS", orcamento)) {
			if (existe("CANETE", orcamento)) {
				return orcamento.getValor() * 0.05;

			}

		}

		return proximo.desconta(orcamento);

	}

	@Override
	public void proximoDesconto(Desconto proximo) {
		this.proximo = proximo;

	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

}
