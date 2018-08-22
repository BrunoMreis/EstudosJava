package tratamentodeerro;

public class testeexcecaoComTratamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio Main");
		try {
			metodo1();
		} catch ( MinhaExcecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim do Main");

	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Início metodo1");
		metodo2();
		System.out.println("Fim metodo1");
		throw new ArithmeticException("Deu erro");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Início metodo2");
		metodo2();
		 throw new MinhaExcecao("Se fudeu");
		// ArithmeticException exception = new ArithmeticException();
		// throw exception;

		// System.out.println("Fim metodo2");
	}

}
