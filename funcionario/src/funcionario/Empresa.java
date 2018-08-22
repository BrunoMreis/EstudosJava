package funcionario;

public class Empresa {
	private String nome;
	private String cnpj;
	private String endereco;
	private String fundacao;
	private int posicao = 0;
	private int posicao2 = 0;
	Funcionario[] funcionarios;

	
	
	
	public Empresa(int comprimento) {
		this.funcionarios = new Funcionario[comprimento];
	}

	void adiciona(Funcionario f) {
		this.funcionarios[posicao] = f;
		this.posicao++;
	}

	void mostraFuncionarios() {
		for (Funcionario funcionario : this.funcionarios) {
			if (funcionario == null)
				continue;
			System.out.println("Funcionário na posição: " + posicao2);
			funcionario.mostra();
			posicao2++;

		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Funcionario getFuncionarios(int posicao) {
		return this.funcionarios[posicao];
	}



	public String getFundacao() {
		return fundacao;
	}

	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}

}
