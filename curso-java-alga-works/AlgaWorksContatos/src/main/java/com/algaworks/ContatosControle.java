package com.algaworks;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControle {

	private static final ArrayList<Contato>	LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 34 00000 0000"));
		LISTA_CONTATOS.add(new Contato("2", "João", "+55 34 00000 0000"));
		LISTA_CONTATOS.add(new Contato("3", "Normandes", "+55 34 00000 0000"));
		LISTA_CONTATOS.add(new Contato("4", "Thiago", "+55 34 00000 0000"));
		LISTA_CONTATOS.add(new Contato("5", "Alexandre", "+55 34 00000 0000"));
	}
	
	@GetMapping("/")
	public String index () {
		return "index.html";
	}
}
