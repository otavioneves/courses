import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class TestaLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("aaa");
		palavras.add("aaaa");
		palavras.add("aa");

		palavras.sort(comparing(String::length));
		
		palavras.forEach(System.out::println);
		
		palavras.forEach(s -> System.out.println(s));

		
	}

}
