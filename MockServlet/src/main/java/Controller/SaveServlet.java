package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/save")
public class SaveServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empid=Integer.parseInt(req.getParameter("empid"));
	String name=req.getParameter("name");
	long mobile=Long.parseLong(req.getParameter("mobile"));
	
	Student student=new Student();
	student.setEmpid(empid);
	student.setMobile(mobile);
	student.setName(name);
	
	Studentdao dao=new Studentdao();
	dao.save(student);
	
	resp.getWriter().print("<h1>Data saved successfully</h1>");
	req.getRequestDispatcher("Home.html").include(req, resp);
}
}
