package tratamentodeerro;

public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Criando Conexão!");
	}

	public void leDados() {
		System.out.println("Recebendo Dados");

		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Fecha Conexão");
	}

}
