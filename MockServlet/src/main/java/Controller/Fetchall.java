package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/fetchall")
public class Fetchall extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student student=new Student();
	Studentdao dao=new Studentdao();
	
	req.setAttribute("student", student);
	req.setAttribute("list", dao.fetch());
	req.getRequestDispatcher("fetch.jsp").include(req, resp);
}
}
