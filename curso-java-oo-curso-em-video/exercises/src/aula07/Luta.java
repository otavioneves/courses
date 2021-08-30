package aula07;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private Integer rounds;
	private Boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		
		System.out.println();
		System.out.println("Marcando a luta...");
		System.out.println();
		if (!(l1.getCategoria() == l2.getCategoria())) {
			System.out.println("Lutadores não são da mesma categoria.");
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}	else if (l1.equals(l2)) {
			System.out.println("Lutadores são iguais.");
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		} else {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}
		
		System.out.println();
	
	}
		
	public void lutar() {
		if (this.getAprovada().equals(true)) {
			System.out.println("#####DESAFIADO#####");
			this.desafiado.apresentar();
			System.out.println("#####DESAFIANTE#####");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);		
			
			switch (vencedor) {
			case 0:
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println(this.desafiado.getNome() + " ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				this.desafiado.apresentar();
				break;
			case 2:
				System.out.println(this.desafiante.getNome()+ " ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				this.desafiante.apresentar();
				break;
			default:
				break;
			}	
		}
		else {
			System.out.println("Luta não aprovada.");
		}
	}

	
	
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Integer getRounds() {
		return rounds;
	}

	public void setRounds(Integer rounds) {
		this.rounds = rounds;
	}

	public Boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(Boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	
	
	
	
	
	
	
	
}
