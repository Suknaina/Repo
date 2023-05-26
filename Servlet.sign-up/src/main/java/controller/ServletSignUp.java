package controller;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/signup")
public class ServletSignUp extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Name=req.getParameter("name");
		String Email=req.getParameter("email");
		long Mobile=Long.parseLong(req.getParameter("mobile"));
		String Password=req.getParameter("pass");
		String Gender=req.getParameter("gender");
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Mobile);
		System.out.println(Password);
		System.out.println(Gender);
		
		Student student = new Student();
		student.setEmail(Email);
		student.setGender(Gender);
		student.setMobile(Mobile);
		student.setName(Name);
		student.setPass(Password);
		/* or this can be done by not creating a variable
		 * student.setEmail(Email=req.getParameter("email"));
			student.setGender(Gender=req.getParameter("gender"));
			student.setMobile(Long.parseLong(req.getParameter("mobile")));
			student.setName(req.getParameter("name"));
			student.setPass(req.getParameter("pass"));*/
		
		Studentdao dao=new Studentdao();
		dao.save(student);
		
		resp.getWriter().print("<h1>Data saved successfully</h1>");
		req.getRequestDispatcher("login.html").include(req, resp);
		
		
	}
}
