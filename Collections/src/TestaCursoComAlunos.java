import java.util.Collections;
import java.util.Set;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso curso = new Curso("Java - collections", "Paulo");

		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Bruno", 5745);
		Aluno a2 = new Aluno("Marcia", 5955);
		Aluno a3 = new Aluno("Julia", 6842);
		
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		
		//		curso.getAlunos().forEach(aluno -> {
//		    System.out.println(aluno);
//		});
		
		
//		 Set<Aluno> alunos = curso.getAlunos();
//		 Aluno a4 = new Aluno("Regina Reis", 6842);
//		 alunos.add(a4);
		System.out.println(curso.estaMatriculado(a2));
		
		
		
		
	}
	
	

}
