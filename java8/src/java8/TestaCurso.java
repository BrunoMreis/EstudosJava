package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 115));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

//		Optional<Curso> optional = cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();

//		System.out.println("optional " + optional.get().getNome());
		System.out.println("========================================================================");
		Stream<String> streamString = cursos.stream().map(Curso::getNome);
		streamString.forEach(System.out::println);
		System.out.println("========================================================================");
		System.out.println(cursos.stream()
		.mapToInt(Curso::getAlunos)
		.average());
		System.out.println("========================================================================");
		List<Curso> collect = cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());

	}

}
