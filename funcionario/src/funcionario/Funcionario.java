package funcionario;

public class Funcionario {

	private String rg;
	private String nome;
	private String departamento;
	private String funcao;
	private double salario;
	private static int matriculo;
	Data nascimento = new Data();

	public Funcionario() {
		this.matriculo++;
	}

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome + "\nRg: " + this.rg + "\nDepartamento: " + this.departamento
				+ "\nFunção: " + this.funcao + "\nSalaraio: R$" + this.salario + "\nGanho anual: R$"
				+ this.calculaGanhoAnual() + "\nNascimento: " + this.nascimento.geraFormatada() + "\n\n\n");

	}

	public void setAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return salario * 12;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

}
