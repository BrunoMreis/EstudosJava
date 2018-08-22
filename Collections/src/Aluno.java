
public class Aluno {

	private String nome;
	private int numeroMatricula;

	public String getNome() {
		return nome;
	}

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome n�o pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Aluno outroaluno = (Aluno) obj;
//		return this.nome.equals(outroaluno.nome);
//	}
//
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}

	
	
}
