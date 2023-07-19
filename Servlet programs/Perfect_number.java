//Program to check if the given number is perfect or not. (Perfect_number is used to take input).

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Perfect_number extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		int num=Integer.parseInt(request.getParameter("n"));
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			out.print("Number is Perfect");
		}else {
			out.print("Number is not perfect");
		}
}
}