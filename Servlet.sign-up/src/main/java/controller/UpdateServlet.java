package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	long mobile=Long.parseLong(req.getParameter("mobile"));
	String password=req.getParameter("pass");
	String email=req.getParameter("email");
	
	Student student =new Student();
	student.setId(id);
	student.setName(name);
	student.setMobile(mobile);
	student.setEmail(email);
	student.setPass(password);
	
	Studentdao dao=new Studentdao();
	dao.update(student);
	
	resp.getWriter().print("<h1>Updated Successfully</h1>");
	req.getRequestDispatcher("Home.html").include(req, resp);
}
}
