package interfaces;

public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculodaArea() {
		// TODO Auto-generated method stub
		return (this.largura * this.altura);
	}

}
