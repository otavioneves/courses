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
	
//		public void destroy() {		// o método destroy é rodado quando o Tomcat baixa a aplicação
//			// TODO Auto-generated method stub
//		}
//		public void init(FilterConfig fConfig) throws ServletException { 	// o método init é rodado quando o Tomcat inicia a aplicação
//			// TODO Auto-generated method stub
//		}
	
		public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
	
			System.out.println("AutorizacaoFilter");
			
			HttpServletRequest request = (HttpServletRequest) servletRequest;	// utilizamos o cast para transformar algo mais genérico em uma referência mais específica, para poder usar os métodos.
			HttpServletResponse response = (HttpServletResponse) servletResponse;	// utilizando o cast
			
			String paramAcao = request.getParameter("acao");
			
			HttpSession sessao = request.getSession();
			Boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
			Boolean naoEhUmaAcaoProtegida = paramAcao.equals("Login")|| paramAcao.equals("LoginForm");
			
			if (usuarioNaoEstaLogado && !naoEhUmaAcaoProtegida) {
				response.sendRedirect("entrada?acao=LoginForm");
				return;		// sai da execução
			}
			
			chain.doFilter(request, response);
		}
	

	
	}
