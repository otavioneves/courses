package projetoFinal;

public class Video implements AcoesVideo {

	private String titulo;
	private Integer views, curtidas;
	private Integer avaliacao;
	private Boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.setAvaliacao(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
		this.setViews(0);
	}
	
	
	
	@Override	
	public String toString() {
		return "\nVideo " + titulo + "\nViews=" + views + "\nCurtidas=" + curtidas + "\nAvaliacao=" + avaliacao
				+ "\nReproduzindo? " + reproduzindo + "]";
	}



	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}
	public Integer getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Integer avaliacao) {
		int nova;
		nova = (this.avaliacao + avaliacao)/this.views;
		this.avaliacao = nova;
	}
	public Boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(Boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	
	@Override
	public void play() {
		this.setReproduzindo(true);
		System.out.println("/nReproduzindo/n");
	}
	@Override
	public void pause() {
		this.setReproduzindo(false);
		System.out.println("/nParado/n");
	}
	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas()+1);
	}
	
	
	
	
	
}
