package Demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class Sample extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	res.getWriter().print(req.getAttribute("a"));
	
//	res.getWriter().print("Hello this is Sample");
//	req.getRequestDispatcher("Myhtml.html").include(req, res);
	
	//res.sendRedirect("https://www.youtube.com");
}
}
