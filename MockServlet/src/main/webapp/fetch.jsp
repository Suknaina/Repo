<%@page import="java.util.List"%>
<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Student student = (Student) request.getAttribute("student");
		List<Student> list = (List<Student>) request.getAttribute("list");//from rrylist its being upcsted then get stored.
		//we re setting the value in servlet hence when we run this file student and list will be null, 
		//so when we run login.html the values are set and objects will be stored and printed.
	%>
	<br><br><br><br><br>
	<center>
	<div>
		<table border="1" bgcolor="skyblue" width="500px">
			<tr>
				<th>ID</Id>
				<th>Name</th>
				<th>Mobile</th>
				
			</tr>
			<%for(Student student1:list) { %>
			<tr>
				<th><%=student1.getEmpid()%></th>
				<th><%=student1.getName()%></th>
				<th><%=student1.getMobile()%></th>
			</tr>
			
			<% } %>

		</table>
		<br>
<a href="Home.html"><button>Home page</button></a>
	</div>
	</center>
</body>
</html>