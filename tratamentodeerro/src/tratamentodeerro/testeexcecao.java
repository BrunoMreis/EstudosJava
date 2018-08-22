package tratamentodeerro;

public class testeexcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio Main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim do Main");

	}

	private static void metodo1() {
		System.out.println("Início metodo1");
		metodo2();
		System.out.println("Fim metodo1");
	}

	private static void metodo2() {
		System.out.println("Início metodo2");
		
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1));

				int a = i / 0;
				Conta c = null;
				c.deposita();
			}
		} catch (ArithmeticException ex) {
			System.out.println("Exeception " + ex.getMessage());
			ex.printStackTrace();
		}

		System.out.println("Fim metodo2");
	}

}
