package br.com.otavio.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//	@WebFilter("/entrada")
	public class AutorizacaoFilter implements Filter {
	
//		public void destroy() {		// o m�todo destroy � rodado quando o Tomcat baixa a aplica��o
//			// TODO Auto-generated method stub
//		}
//		public void init(FilterConfig fConfig) throws ServletException { 	// o m�todo init � rodado quando o Tomcat inicia a aplica��o
//			// TODO Auto-generated method stub
//		}
	
		public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
	
			System.out.println("AutorizacaoFilter");
			
			HttpServletRequest request = (HttpServletRequest) servletRequest;	// utilizamos o cast para transformar algo mais gen�rico em uma refer�ncia mais espec�fica, para poder usar os m�todos.
			HttpServletResponse response = (HttpServletResponse) servletResponse;	// utilizando o cast
			
			String paramAcao = request.getParameter("acao");
			
			HttpSession sessao = request.getSession();
			Boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
			Boolean naoEhUmaAcaoProtegida = paramAcao.equals("Login")|| paramAcao.equals("LoginForm");
			
			if (usuarioNaoEstaLogado && !naoEhUmaAcaoProtegida) {
				response.sendRedirect("entrada?acao=LoginForm");
				return;		// sai da execu��o
			}
			
			chain.doFilter(request, response);
		}
	

	
	}
