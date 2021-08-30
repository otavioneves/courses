package aula09;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private Integer totPaginas;
	private Integer pagAtual;
	private Boolean aberto;
	private Pessoa leitor;
		
	public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.setAberto(false);
		this.leitor = leitor;
		this.setPagAtual(0);
	}
	
	
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}



	public void detalhes() {
		System.out.println();
		System.out.println("-----LIVRO-----");
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Página Atual: " + this.getPagAtual());
		if (this.getAberto()) {
			System.out.println("O livro está aberto.");
		} else {
			System.out.println("O livro está fechado.");
		}
		System.out.println("O LEITOR ATUAL DO LIVRO: " + leitor.getNome());
		System.out.println("---------------");
		System.out.println();
	}
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(Integer totPaginas) {
		this.totPaginas = totPaginas;
	}
	public Integer getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(Integer pagAtual) {
		this.pagAtual = pagAtual;
	}
	public Boolean getAberto() {
		return aberto;
	}
	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}



	@Override
	public void abrir() {
		
		this.setAberto(true);
		System.out.println("****Livro aberto!****");
	}



	@Override
	public void fechar() {
		this.setAberto(false);
		System.out.println("****Livro fechado!****");
	}



	public void folhear(int pag) {
		if (this.getAberto()) {
		if (pag < this.getTotPaginas()) {
		this.setPagAtual(pag);
		System.out.println("****Livro folheado até a página " + pag);
		} else {
			System.out.println("Não existe essa página no livro.");
		}
		}	else {
			System.out.println("O livro está fechado.");
		}
	}



	@Override
	public void avancarPag() {
		if (this.getAberto()) {
			if (!(this.getPagAtual()==this.getTotPaginas())) {
				this.setPagAtual(this.getPagAtual()+1);
				System.out.println("****Avançou uma página****");
			} else {
				System.out.println("Impossível avançar uma página.");
			}
		}	else {
			System.out.println("O livro está fechado.");
		}
		
	}
		



	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			if (this.getPagAtual().equals(0)) {
				this.setPagAtual(this.getPagAtual()-1);
				System.out.println("****Voltou uma página****");
			} else {
				System.out.println("Impossível voltar uma página.");
			}
		}	else {
		System.out.println("O livro está fechado.");
	}
	
	}
	
	
	
}
