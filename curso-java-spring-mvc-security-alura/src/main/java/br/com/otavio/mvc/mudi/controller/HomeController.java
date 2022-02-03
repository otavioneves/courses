package br.com.otavio.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String home(Model model) {
		List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos",pedidos);
		return "home";
	}
	
	@GetMapping("/{status}")
	public String porStatus(@PathVariable("status")String status, Model model) {
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
		model.addAttribute("pedidos",pedidos);
		model.addAttribute("status",status);
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
	
//	@GetMapping
//	public ModelAndView home() {
//	    List<Pedido> pedidos = pedidoRepository.findAll();
//	    ModelAndView mv = new ModelAndView("home");
//	    mv.addObject("pedidos", pedidos);
//	    return mv; 
//	}   
//	
//	@GetMapping("/aguardando")
//	public ModelAndView aguardando() {
//	    List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.AGUARDANDO);
//	    ModelAndView mv = new ModelAndView("aguardando");
//	    mv.addObject("pedidos", pedidos);
//	    return mv; 
//	}
	
	
}
