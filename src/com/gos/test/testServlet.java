package com.gos.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testServlet extends HttpServlet{
	
	public static int count;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		PrintWriter out = response.getWriter();
		count++;
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet Get Request : " + count + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}