<%@page import="java.util.Arrays" %>
<%@page import="java.util.Collection" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1{
color: blue;
}
</style>
</head>
<body>
<h1>Hello this is jsp file</h1>

<%-- This is java code --%>

<% System.out.println("Hello this is java code"); %>

<%!int a=5; %><%--Global variable --%>

<% int a=9; %><%--Local variable --%>

<% System.out.println(a); %>
<%!
void add()
{
	System.out.println(this.a);
}
%>
<% response.getWriter().print(a); %>
<h1><%out.print(a); %></h1>
<h1><%=a %></h1>
<%@include file="index.jsp" %>
<%String q="Java"; %>
<h2><%=q %></h2>
<% 
List l=Arrays.asList(1,2,1,2);
System.out.println(l);
%>

<%= l %>



</body>
</html>
