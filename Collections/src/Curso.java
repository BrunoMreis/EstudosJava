import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private int tempoToatal;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculasParaAlunos = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculasParaAlunos.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno outroAluno) {
		return this.alunos.contains(outroAluno);

	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public int getTempoToatal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	@Override
	public String toString() {
		return "[ Curso: " + this.nome + " Tempo tato: " + this.getTempoToatal() + " aulas: " + "[" + this.aulas + "]"
				+ "]";
	}

	public Aluno buscaMatriculaso(int matricula) {
		return this.matriculasParaAlunos.get(matricula);
		// TODO Auto-generated method stub/

	}

}
