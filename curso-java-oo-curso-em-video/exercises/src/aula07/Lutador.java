package aula07;

public class Lutador {

	private String nome, categoria, nacionalidade;
	private Integer idade, vitorias, derrotas, empates;
	private Double altura, peso;
	
	
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);	
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	public void apresentar () {
		System.out.println();
		System.out.println("--------------"+ this.getNome() + "-----------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade()+" anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando" + this.getPeso() + "Kg");
		System.out.println("Ganhou " + this.getVitorias());
		System.out.println("Perdeu " + this.getDerrotas());
		System.out.println("Empatou " + this.getEmpates());
		System.out.println("----------------------------------------------------");
		System.out.println();
	}
	
	public void status() {
		System.out.print(this.getNome());
		System.out.print(" é um peso " + this.getCategoria());
		System.out.print(". Ele tem " + this.getVitorias() + " vitórias, ");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates. ");
	}
	
	
	
	
	public Lutador(String nome, String nacionalidade, Integer idade, Integer vitorias,
			Integer derrotas, Integer empates, Double altura, Double peso) {
		super();
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setEmpates(empates);
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2) {
			categoria = "Inválido";
		} else if (this.peso<=70.3){
			categoria = "Leve";
		} else if (this.peso<=83.9) {
			categoria = "Médio";
		} 	else if (this.peso<=120.2) {
			categoria = "Pesado";
		} 	else {
			categoria = "Inválido";
		}
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getVitorias() {
		return vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Integer getEmpates() {
		return empates;
	}
	public void setEmpates(Integer empates) {
		this.empates = empates;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	
	
	
	
	
	
}
