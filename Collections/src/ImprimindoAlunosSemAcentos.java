import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		alunos.add("Bruno");
		alunos.add("Charlene");
		alunos.add("Clack");
		alunos.add("Leona");
		alunos.add("May");
		alunos.add("Luciana");
		

		// alunos.forEach(aluno ->{
		// System.out.println(alunos);
		// });

		for (String aluno : alunos) {
			System.out.println(aluno);

		}
		
		System.out.println(alunos.size());
		
		alunos.add("Clack");
		alunos.add("Leona");
		alunos.add("May");
		alunos.add("Luciana");
		
		System.out.println(alunos.size());

	}

}
