package br.com.otavio.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.otavio.gerenciador.acao.Acao;


//	@WebFilter("/entrada")
	public class ControladorFilter implements Filter {
	
	
		public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
	
			System.out.println("ControladorFilter");
			
			HttpServletRequest request = (HttpServletRequest) servletRequest;	// utilizamos o cast para transformar algo mais genérico em uma referência mais específica, para poder usar os métodos.
			HttpServletResponse response = (HttpServletResponse) servletResponse;	// utilizando o cast
			
			String paramAcao = request.getParameter("acao");	
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
		}
	}
