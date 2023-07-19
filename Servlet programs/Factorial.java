//Program to print the Factorial of a given number. (Factorial.html is used to take input).

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Factorial extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		int number=Integer.parseInt(request.getParameter("num")) ;
		int fact=1;
		for(int i=1; i<=number; i++) {
			fact=fact*i;
		}
		out.print("Factorial is "+fact);
}
}