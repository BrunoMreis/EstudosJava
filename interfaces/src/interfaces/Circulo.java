package interfaces;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculodaArea() {
		// TODO Auto-generated method stub
		return (this.raio * this.raio * Math.PI);
	}

}
