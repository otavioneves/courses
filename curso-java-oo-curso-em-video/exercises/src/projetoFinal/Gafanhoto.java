package projetoFinal;

public class Gafanhoto extends Pessoa {
	
	public Gafanhoto(String nome, String sexo, Integer idade, String login) {
		super(nome, sexo, idade);
		this.setLogin(login);
		this.setTotAssistido(0);
	}

	private String login;
	private Integer totAssistido;
	
	public void viuMaisUm() {
		this.setTotAssistido(this.getTotAssistido()+1);
		this.setExperiencia(this.getExperiencia()+1);

	}

	
	
	@Override
	public String toString() {
		return "\nGafanhoto\nLogin=" + login + "\nNome:"+ nome + "\nSexo: " + sexo + "\nIdade: "+idade+ "\nTotal de Vídeos Assistidos: " + totAssistido + "\n";
	}



	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(Integer totAssistido) {
		this.totAssistido = totAssistido;
	}

	
}
