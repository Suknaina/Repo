package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/empidsearch")
public class EmpSearch extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int empid=Integer.parseInt(req.getParameter("empid"));
	
	Studentdao dao=new Studentdao();
	Student student=dao.fetch(empid);
	if(student==null)
	{
		resp.getWriter().print("<h1>Data not availabe</h1>");
		req.getRequestDispatcher("Home.html").include(req, resp);
	}
	if(student.getEmpid()==empid)
	{
		req.setAttribute("student", student);
		req.getRequestDispatcher("empid.jsp").include(req, resp);
		
	}
	
}
}

