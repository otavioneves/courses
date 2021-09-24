package com.otavio.cursojava.aula52.labs;

public class Agenda {

	private Contato[] contatos;

	public Agenda(Contato[] contatos) {
		contatos = new Contato [5];
	}

	public Agenda() {
		
	}
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		
		boolean cheia = true;
		for (int i=0;i<contatos.length;i++) {
			
			if (contatos[i] != null) {
				contatos[i] = c;
				cheia = false;
			}
			
			if (cheia) {
				throw new AgendaCheiaException();
			}
		}
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExiste {
		
		for (int i = 0; i<contatos.length;i++) {
			
			if (contatos[i] != null) {
				
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
				
			}
			
		}
		throw new ContatoNaoExiste(nome);
	}
	
	
	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			s = c.toString() + "\n";
		}
		return s;
	}




	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
}
