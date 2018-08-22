import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso curso = new Curso("Java - collections", "Paulo");

		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
		List<Aula> aulasImutaveis = curso.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(curso.getTempoToatal());
		System.out.println("");
		System.out.println("");
		System.out.println(curso);
	}

}
