package aula06;

public class Controle implements Controlador{

	private Integer volume;
	private Boolean ligado;
	private Boolean tocando;
	public Controle() {
		super();
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}
	
	
	private Integer getVolume() {
		return volume;
	}
	private void setVolume(Integer volume) {
		this.volume = volume;
	}
	private Boolean getLigado() {
		return ligado;
	}
	private void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	private Boolean getTocando() {
		return tocando;
	}
	private void setTocando(Boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		System.out.println("Ligado");
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.getLigado().equals(false)){
			System.out.println("TV desligada");
		} else {
		
		System.out.println();
		System.out.println("--------------MENU--------------");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());

		
		for (int i=0;i<=this.getVolume();i+=10) {
			System.out.print("|");
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		
		}
	}

	@Override
	public void fecharMenu() {
		if (this.getLigado().equals(false)){
			System.out.println("TV desligada");
		} else {
		System.out.println("Fechar Menu");
		}
	}


	@Override
	public void maisVolume() {
		if(this.getLigado()&&this.getVolume()<100) {
			this.setVolume(this.getVolume()+10);
			System.out.println("Volume: " + this.getVolume());
		} else if (this.getVolume().equals(100)){
			System.out.println("Volume no máximo");
		} else {
			System.out.println("TV Desligada");
		}
	}


	@Override
	public void menosVolume() {
		if (this.getLigado()&&this.getVolume()>0) {
			this.setVolume(this.getVolume()-10);
			System.out.println("Volume: " + this.getVolume());
		} else if (this.getVolume().equals(0)) {
			System.out.println("Volume no mínimo");			
		} else {
			System.out.println("TV Desligada");
		}
	}


	@Override
	public void ligarMudo() {
		if (this.getLigado()&&this.getVolume()>0) {
			this.setVolume(0);
			System.out.println("Mudo");
		} else if (this.getVolume().equals(0)) {
			System.out.println("O volume já está em 0.");
		} else {
			System.out.println("A TV está desligada.");
		}
	}


	@Override
	public void desligarMudo() {
		if (this.getLigado()&&this.getVolume().equals(0)) {
			this.setVolume(50);
			System.out.println("Desligado Mudo. Volume " + this.getVolume());
		} else if (this.getLigado().equals(false)) {
			System.out.println("A TV está desligada.");
		} else {
			System.out.println("TV já está com volume.");

		}
			
		
	}

	
	@Override
	public void play() {
		if (this.getLigado().equals(false)){
			System.out.println("TV desligada");
		} else {
		if (this.getLigado()&& !(this.getTocando())) {
			this.setTocando(true);
		}
		}
	}

	@Override
	public void pause() {
		if (this.getLigado().equals(false)){
			System.out.println("TV desligada");
		} else {
		if (this.getLigado()&& this.getTocando())
			this.setTocando(false);
		}
	}
	
}
