package application1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.print("hi ");
//		request.getServletContext()
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.print(str);
		
			
	}
}
