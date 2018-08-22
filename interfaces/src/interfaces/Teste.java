package interfaces;

public class Teste {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(10, 2);
		System.out.println("Área do retangulo: " + retangulo.calculodaArea());

		Quadrado quadrado = new Quadrado(3);
		System.out.println("Área do quadrado: " + quadrado.calculodaArea());
		
		Circulo circulo = new Circulo(3.55);
		System.out.println("Área do circulo: " + circulo.calculodaArea());
	}
}
