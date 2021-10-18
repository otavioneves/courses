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
		
		// podemos também transformar esse Optional em um Curso em si, utilizando o método orElse: devolva, se não, devolva null
		
		Curso curso = optionalCurso.orElse(null);
		
		System.out.println(curso.getNome());
		
		// podemos também utilizar o ifPresent, que recebe um lambda, nesse caso onde escrevemos: caso tenha algum curso, imprima, caso não, não faça nada.
		
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		// podemos fazer também da seguinte maneira:
		
		cursos.stream().filter(c -> c.getAlunos()>=100).findAny().ifPresent(c -> System.out.println(c.getNome()));
		
		// outro método que podemos utilizar é o average, que calcula a media
		
		OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).average();
		
		System.out.println(media);

		// o método collect é utilizado para coletar e guardar dentro de um Collector, que é uma classe que possuí varios métodos que transformarão em uma Collection, como list, map, set. Essa maneira faz com que possamos filtrar e jogar novamente na Collection original, saindo do Stream.
		
		cursos = cursos.stream().filter(c -> c.getAlunos()>=100).collect(Collectors.toList());
		
		System.out.println(cursos);
		
		
		
	}

}
