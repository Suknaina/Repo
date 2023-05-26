package calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http-any url it follows http protocol. response with css html
//ftp-file transfer protocol-sharing for files
//http- it gives service but long with it, it gives service(), gives extra methods for extra restrictions
//for extra logic it gives dopost(),doget(),doput(),dodelete()
@WebServlet("/div")
public class Div extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	double num1 = Double.parseDouble(req.getParameter("num1"));
	int num2 = Integer.parseInt(req.getParameter("num2"));
	resp.getWriter().print("<html><body> <h1 style='color:blue'>The div of " + num1 + " and " + num2 + " is " + (num1 / num2) +"</h1></body></html>");
//if we use here dopost and formmethod as get we get 405 error
}
}
//service method- accepts both get and post hence is a generic method
//post- not visible in url but present in body nd pssed to the server
//404 error for get and post methods