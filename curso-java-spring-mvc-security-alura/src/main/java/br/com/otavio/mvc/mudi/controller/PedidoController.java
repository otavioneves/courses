package br.com.otavio.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.otavio.mvc.mudi.dto.RequisicaoNovoPedido;
import br.com.otavio.mvc.mudi.model.Pedido;
import br.com.otavio.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido") // todas as requisições que forem pra pedido cai nesse controller
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;	// classe que faz o relacionamento com o banco de dados
	
	
	@GetMapping("formulario") // /pedido já está mapeado no nível do controller, e /formulário será mapeado no nível da action
	public String formulario(RequisicaoNovoPedido requisicao) {
		
		// esse método apenas retorna qual a página HTML deve ser renderizada para o usuário
			
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		
		if (result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = requisicao.toPedido();	// convertendo um requisição em um pedido
		pedidoRepository.save(pedido);			
		
		return "redirect:/home";
	}
	
}
