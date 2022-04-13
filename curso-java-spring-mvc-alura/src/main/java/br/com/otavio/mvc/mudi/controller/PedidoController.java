package br.com.otavio.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.otavio.mvc.mudi.dto.RequisicaoNovoPedido;
import br.com.otavio.mvc.mudi.model.Pedido;
import br.com.otavio.mvc.mudi.model.User;
import br.com.otavio.mvc.mudi.repository.PedidoRepository;
import br.com.otavio.mvc.mudi.repository.UserRepository;

@Controller
@RequestMapping("pedido") // todas as requisições que forem pra pedido cai nesse controller
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;	// classe que faz o relacionamento com o banco de dados
	
	@Autowired
	private UserRepository userRepository;
	
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
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.findByUsername(username);
		
		Pedido pedido = requisicao.toPedido();	// convertendo um requisição em um pedido
		pedido.setUser(user);
		pedidoRepository.save(pedido);			
		
		return "redirect:/home";
	}
	
}
