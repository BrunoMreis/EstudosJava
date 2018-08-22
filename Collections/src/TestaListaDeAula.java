import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula a1 = new Aula("Revistando as ArrayList", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e obejetos", 15);
		
		List <Aula> aulas = new ArrayList();
		
		aulas.add(a1);
		aulas.add(a3);
		aulas.add(a2);
		
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo()));
//		Collections.sort(aulas);
		System.out.println(aulas);
		
	}

}
