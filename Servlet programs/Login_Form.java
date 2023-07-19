// Program to take username and passworf from user and check if he/she is able to login or not.

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Login_Form extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String Username=request.getParameter("Username");
		String Password=request.getParameter("Password");
		
        if(Username.equals("Afridi") && Password.equals("1234")) {
        	out.print("Login Successfully :)");
        }else {
        	out.print("Login Failed");
        }
	}
}