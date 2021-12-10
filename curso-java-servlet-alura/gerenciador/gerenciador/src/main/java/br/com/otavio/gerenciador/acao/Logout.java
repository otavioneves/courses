package br.com.otavio.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sessao = request.getSession();
			
//		sessao.removeAttribute("usuarioLogado");		modo menos elegante
	
		sessao.invalidate();		// remove o objeto HttpSession, todos os seus associados, e remove também o cookie. Maneira mais elegante de fazer.
		
		return "redirect:entrada?acao=LoginForm";
	}

	
	
}
