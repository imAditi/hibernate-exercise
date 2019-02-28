<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1 align = "center">Employee Registration Form</h1>
<form action = "EmployeeRegistrationController" method = "post">
<table align = "center" cellpadding ="10" border = "1">
<tr>
<td>First Name</td>
<td>
<input type = "text" name = "firstName" maxlength = "30"/>
</td>
</tr>
<tr>
<td>Middle Name</td>
<td>
<input type = "text" name = "middleName" maxlength = "30"/>
</td>
</tr>
<td>Last Name</td>
<td>
<input type = "text" name = "lastName" maxlength = "30"/>
</td>
</tr>
<td>User Id</td>
<td>
<input type = "text" name = "userId" maxlength = "100"/>
</td>
</tr>
<td>Password</td>
<td>
<input type = "text" name = "password" maxlength = "20"/>
</td>
</tr>
<td>Email</td>
<td>
<input type = "text" name = "email" maxlength = "100"/>
</td>
</tr>
<tr>
<td colspan = "2" align ="center">
<input type = "submit" value = "Register"/>
<input type = "reset" value = "Reset"/>
</td>
</tr>
</table>
</form>
</body>
</html>