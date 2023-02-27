<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="logCustomer" method="post">
	<label for="tbemail">Email:</label>
	<input type="email" name="tbemailLog" id="tbemailLog" value=" <%= request.getParameter("tbemail")%>" />
	<br>
	<label for="tbpass">Password:</label>
	<input type="password" name="tbpassLog" id="tbpassLog" value="<%= request.getParameter("tbpassword")%>" />
	<br>
	<input type="submit" value="login" />
	</form>


</body>
</html>