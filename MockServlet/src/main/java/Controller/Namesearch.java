package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/namesearch")
public class Namesearch extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	
	Studentdao dao=new Studentdao();
	Student student=dao.fetch(name);
	if(student==null)
	{
		resp.getWriter().print("<h1>Data not availabe</h1>");
		req.getRequestDispatcher("Home.html").include(req, resp);
	}
	
	else if(student.getName().equals(name))
	{
		req.setAttribute("student", student);
		req.getRequestDispatcher("name.jsp").include(req, resp);
		
	}
	else
	{
		resp.getWriter().print("<h1>Data not availabe</h1>");
		req.getRequestDispatcher("Home.html").include(req, resp);
	}
	
}
}
