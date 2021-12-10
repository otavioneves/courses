package br.com.otavio.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter("/entrada")		// todas as requisições que chegarem passam pelo Filter
public class MonitoramentoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("MonitoramentoFilter");
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		
		chain.doFilter(request, response);		// continua executando, depois volta
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de execução (" + acao + "): "+ (depois - antes));		
	}
}
