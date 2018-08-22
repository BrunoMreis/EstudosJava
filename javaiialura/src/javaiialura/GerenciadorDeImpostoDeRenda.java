package javaiialura;

public class GerenciadorDeImpostoDeRenda {

	private double total;

	public void adicina(Tributavel t) {
		System.out.println("Adiciona Tributavel: " + t);
		this.total += t.calculaTributos();

	}

	public double getTotal() {
		return this.total;
	}
	
	
}
