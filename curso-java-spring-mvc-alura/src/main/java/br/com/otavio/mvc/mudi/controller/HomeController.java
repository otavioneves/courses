package br.com.otavio.mvc.mudi.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.otavio.mvc.mudi.model.Pedido;
import br.com.otavio.mvc.mudi.model.StatusPedido;
import br.com.otavio.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

	
	@Autowired		// para evitar NullPointer
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public String home(Model model, Principal principal) {
			
		Sort sort = Sort.by("dataDaEntrega").descending();	// ordenação
		PageRequest paginacao = PageRequest.of(0, 10, sort);	//paginação
		
		
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.ENTREGUE, paginacao);
		model.addAttribute("pedidos",pedidos);
		return "home";
	}
		
}