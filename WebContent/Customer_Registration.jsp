<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
	<h1>Customer Registration Page</h1>
	<form action="regCustomer" method="post">
		Name:<input type="text" name="tbname" id="tbname" />
		 <br /> 
		 Email:<input
			type="email" name="tbemail" id="tbemail" /> <br />
 Password:<input
			type="password" name="tbpassword" id="tbpassword" /> 
			<br />
		Mobile:<input
			type="text" name="tbmobile" id="tbmobile" />
			 <br />
		 State:
		 <select name="ddlcities">
			<option value="Karnataka">KA</option>
			<option value="Tamilanadu">TM</option>
			<option value="Andrapradesh">AP</option>
			<option value="Kerala">KL</option>
		</select> <br /> <input type="submit" name="Register" />
	</form>

</body>
</html>