package gste8;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String color=req.getParameter("color");
	
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	double cgst1=Double.parseDouble(cgst);
	
	System.out.println("CGST IS :::::"+cgst1);
	
	
	ServletConfig config=getServletConfig();
	String sgstofkar=config.getInitParameter("sgstofkar");
	System.out.println("SGST OF KAR IS :::"+sgstofkar);
	
	
	
	
	
	
}
}
