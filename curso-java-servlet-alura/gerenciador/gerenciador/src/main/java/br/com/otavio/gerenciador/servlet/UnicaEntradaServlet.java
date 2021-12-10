package br.com.otavio.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.otavio.gerenciador.acao.Acao;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");	// pega o parâmetro ação
		
		// lógica aplicada no filtro
//		HttpSession sessao = request.getSession();
//		Boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//		Boolean naoEhUmaAcaoProtegida = paramAcao.equals("Login")|| paramAcao.equals("LoginForm");
//		
//		if (usuarioNaoEstaLogado && !naoEhUmaAcaoProtegida) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;		// sai da execução
//		}
			
		
		String nomeDaClasse = "br.com.otavio.gerenciador.acao."+ paramAcao;
		String nome;
		
		try {
				
			Class classe = Class.forName(nomeDaClasse); // carrega a classe com o nome e me retorna a classe
			Acao acao = (Acao) classe.newInstance();		// cast para a interface, para poder usar o nmétodo executa
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEndereco = nome.split(":");		// o primeiro índice do array será se é forward ou redirect, o segundo índice do array é o endereço
		
		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
		
////		String nome = null; 		// ação retornada pela classe 
//
//		if (paramAcao.equals("ListaEmpresa")){
//			
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request,response);
//			
//		} else if (paramAcao.equals("RemoveEmpresa")){
//			
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//			
//		} else if (paramAcao.equals("MostraEmpresa")){
//			
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(request, response);
//			
//		} else if (paramAcao.equals("AlteraEmpresa")){
//			
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//			
//		} else if (paramAcao.equals("NovaEmpresa")){
//			
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request, response);
//			
//		} else if (paramAcao.equals("NovaEmpresaForm")){
//			
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome = acao.executa(request, response);
//			
//		} 
				
	}

}
