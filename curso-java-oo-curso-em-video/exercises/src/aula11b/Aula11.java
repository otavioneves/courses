package aula11b;

public class Aula11 {

	public static void main(String[] args) {

		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("Masculino");
		System.out.println(v1.toString());
		
		
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("Masculino");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Jubileu");
		b1.setMatricula(2222);
		b1.setCurso("Engenharia");
		b1.setIdade(20);
		b1.setSexo("Masculino");
		b1.setBolsa(12.5);
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
	}

}
