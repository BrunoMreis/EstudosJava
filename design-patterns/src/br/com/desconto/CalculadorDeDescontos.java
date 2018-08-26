package br.com.desconto;

public class CalculadorDeDescontos {
	private double valorDesconto = 0;

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoMaisDeCincoIntens();
//		valorDesconto += d1.desconta(orcamento);
		Desconto d2 = new DescontoOcamentoMaiorQuinhentos();
		Desconto d3 = new DescontoVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.proximoDesconto(d2);
		d2.proximoDesconto(d3);
		d3.proximoDesconto(d4);

		return d1.desconta(orcamento);
	}

}
