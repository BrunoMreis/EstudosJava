package funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f1 = new Funcionario();

		f1.setNome("Bruno");
		f1.setSalario(50);

		f1.setAumento(100);

		Funcionario f2 = new Funcionario();

		f2.setNome("Miranda");
		f2.setSalario(1200.00);
		f2.setRg("66.666.666.66");
		f2.setFuncao("Programador JAVA");
		f2.setDepartamento("Desenvolvimento");
		f2.setAumento(300);

		f2.nascimento.setData(3, 8, 90);
		f2.mostra();

		// if (f1 == f2) {
		// System.out.println("Iguais");
		// } else
		// System.out.println("Diferentes");

	}

}
