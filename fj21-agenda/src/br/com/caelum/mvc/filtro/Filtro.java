package br.com.caelum.mvc.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;




@WebFilter("*")

public class Filtro implements Filter
{
	public void init(FilterConfig filterConfig) throws ServletException
	{
		
	}
	public void destroy()
	{
		
	}
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("aqui");
		chain.doFilter(req, resp);
	}
	
}
