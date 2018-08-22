import java.io.PrintStream;

public class TesteInteger {
	public static void main(String[] args) {

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		PrintStream saida;
		saida = System.out;
		saida.println("ola");

		TesteInteger.reescreve("anotaram a data da maratona");
		TesteInteger.invertetexto("Socorram me, subi no onibus em Marrocos");
	}

	private static void invertetexto(String string) {
		StringBuilder texto = new StringBuilder(string).reverse();
		
		System.out.println(texto);
	}

	public static void reescreve(String string) {

		String palavras[] = string.split(" ");
		int i = palavras.length - 1;
		StringBuilder s = new StringBuilder();
		while (i >= 0) {
			s.append(palavras[i] + " ");

			i--;
		}
		System.out.println(s);

	}

}
