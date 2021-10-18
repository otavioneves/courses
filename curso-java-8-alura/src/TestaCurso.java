import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() >= 50).map(c -> c.getAlunos()).forEach(total -> System.out.println(total));
		
		cursos.stream().filter(c -> c.getAlunos() >= 50).findFirst();

		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos()>=100).findAny();
		
		System.out.println(optionalCurso.get());
		
		// podemos tamb�m transformar esse Optional em um Curso em si, utilizando o m�todo orElse: devolva, se n�o, devolva null
		
		Curso curso = optionalCurso.orElse(null);
		
		System.out.println(curso.getNome());
		
		// podemos tamb�m utilizar o ifPresent, que recebe um lambda, nesse caso onde escrevemos: caso tenha algum curso, imprima, caso n�o, n�o fa�a nada.
		
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		// podemos fazer tamb�m da seguinte maneira:
		
		cursos.stream().filter(c -> c.getAlunos()>=100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		
		// outro m�todo que podemos utilizar � o average, que calcula a media
		
		OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).average();
		
		System.out.println(media);

		// o m�todo collect � utilizado para coletar e guardar dentro de um Collector, que � uma classe que possu� varios m�todos que transformar�o em uma Collection, como list, map, set. Essa maneira faz com que possamos filtrar e jogar novamente na Collection original, saindo do Stream.
		
		cursos = cursos.stream().filter(c -> c.getAlunos()>=100).collect(Collectors.toList());
		
		System.out.println(cursos);
		
		
		
	}

}
