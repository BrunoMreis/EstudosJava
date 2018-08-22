
/**
 * @author bruno
 *
 */
public class Aula implements Comparable<Aula> {
	private String nome;
	private int tempo;

	public Aula(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.nome + ", " + this.tempo + " minutos]";
	}

	
   

	@Override
	 public int compareTo(Aula outraAula) {
        return this.nome.compareTo(outraAula.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}


}
