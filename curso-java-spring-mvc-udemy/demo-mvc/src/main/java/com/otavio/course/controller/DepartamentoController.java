package com.otavio.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DepartamentoController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		
		return "/departamento/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		
		return "/departamento/lista";
	}
	
}
