package com.walmart.ourapplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class OurFirstServlet extends HttpServlet{

	
	private static final long serialVersionUID = -4740548026869613380L;
	private static int i = 0;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String outString = "Hello";
		String responseText = outString + " "+i+" times";
		resp.getOutputStream().write(responseText.getBytes());
		i++;
	}
	
}
