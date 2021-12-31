<%@page import="com.model.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Client c=(Client)session.getAttribute("user");%>
<h1>Bonjour Mr  <%=c.getNom() %></h1>
<p> vous ete un <%=c.getRole() %></p>
</body>
</html>