package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//when we write servlet we have to write all the abstract methods 
//but genericservlet gives one method service where we can write logic
//rest all methods are inside genericservlet
@WebServlet("/sub")
public class Sub extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		int num1 = Integer.parseInt(arg0.getParameter("num1"));
		int num2 = Integer.parseInt(arg0.getParameter("num2"));
		arg1.getWriter().print("<html><body> <h1 style='color:blue'>The sum of " + num1 + " and " + num2 + " is " + (num1 - num2) +"</h1></body></html>");
		
	}
	

}
