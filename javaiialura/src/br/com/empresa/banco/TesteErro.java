package br.com.empresa.banco;

public class TesteErro {
	public static void main(String[] args) {

		System.out.println("Inicio main");

		try {
			m1();
		} catch (Exception e) {
			System.out.println(e);
			
		}

		System.out.println("Fim main");

	}

	static void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inicio m1");

		// try {
		m2();
		// } catch (Exception e) {
		// System.out.println(e);
		// }

		System.out.println("Fim m1");
	}

	static void m2() {
		// TODO Auto-generated method stub
		System.out.println("Inicio m2");
		int[] arry = new int[10];

		for (int i = 0; i < 15; i++) {

			// try {
			arry[i] = i;
			System.out.println(i);
			// } catch (ArrayIndexOutOfBoundsException e) {
			// // TODO: handle exception
			// System.out.println(e);
			// }
		}

		System.out.println("Fim m2");
	}
}
