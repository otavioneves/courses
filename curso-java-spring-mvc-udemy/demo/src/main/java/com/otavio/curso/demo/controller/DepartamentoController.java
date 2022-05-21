package com.otavio.curso.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.otavio.curso.demo.domain.Departamento;
import com.otavio.curso.demo.service.DepartamentoService;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Departamento departamento) {
		
		return "/departamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		
		return "/departamento/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Departamento departamento) {
		departamentoService.salvar(departamento);
		return "redirect:/departamentos/cadastrar";
	}
	
	
}
