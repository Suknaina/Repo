package Demo;

import java.io.IOException;
//RequestDispatcher- it is a interface which will help to carry request from one servlet to other servlet, html or jsp files.

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class Demo_ extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		req.setAttribute("a", "Hello");
		req.getRequestDispatcher("sample").forward(req, res);
		
//		res.setContentType("text/html"); // if we dont give <h1> tag anywhere
//											// this will make the output to be
//											// in html format.
//		res.getWriter().print("Hello this is Demo");// if we dont use setContentType and h1 for this then the output will
//													// have html syntax
//													// including html head title
//													// and everything.
//		req.getRequestDispatcher("Myhtml.html").include(req, res);
//		req.getRequestDispatcher("index.jsp").include(req, res);
//		req.getRequestDispatcher("sample").include(req, res);
		

	}

}
//sendRedirect will go to other services like youtube channel or other but using getrequestdispatcher it will give error.
//sendredirect - travel to one more server, present in httpservlet..
//in sendredirect we cannot add messgae
//include will include the current files content along with the other
		// file we are connecting.
		// forward will not include the content from the current file only
		// displays the contents from other connected/ requested file.
		// rather directly giving the sample file to the client we use through
		// servlet coz servlet is where we create logics.
