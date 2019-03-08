package com.walmart.ourapplication;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/filter")
public class OurWebBuilder implements Filter {

	public void destroy() {
		System.out.println("Filter closed");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter invoked");
		chain.doFilter(req, res);
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter initialized");
	}
	
}
