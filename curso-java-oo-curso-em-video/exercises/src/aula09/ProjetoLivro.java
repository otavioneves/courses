package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {

		Pessoa p[] = new Pessoa[2];
		
		Livro l[] = new Livro [2];
		
		p[0] = new Pessoa("Otavio", 24, "Masculino");
		p[1] = new Pessoa("Carol", 26, "Feminino");
		
		l[0] = new Livro("Caminho", "São Josemaria Escrivá", 250, p[0]);
		l[1] = new Livro("Forja","São Josemaria Escrivá", 280, p[1]);
		
		l[0].detalhes();
		l[1].detalhes();
		
		l[0].abrir();
		l[0].avancarPag();
		
		l[1].avancarPag();
		l[1].abrir();
		l[1].avancarPag();
		
		l[0].detalhes();
		l[1].detalhes();
		
				
		
	}

}
