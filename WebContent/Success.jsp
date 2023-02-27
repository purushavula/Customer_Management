<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "com.techpalle.util.SuccessPage" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<%
SuccessPage spJsp= (SuccessPage) request.getAttribute("succesDetails");
%>
<header>
<h1><%= spJsp.p %></h1>
</header>
<p><%= spJsp.h3 %></p>
<footer>
<h3></h3>
</footer>
</body>
</html>