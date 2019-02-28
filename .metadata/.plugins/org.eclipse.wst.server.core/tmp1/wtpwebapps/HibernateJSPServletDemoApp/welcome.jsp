<%@page import="java.util.List"%>
<%@page import="com.yash.serviceimpl.EmployeeServiceImpl"%>
<%@page import="com.yash.service.EmployeeService"%>
<%@page import="com.yash.model.Employee"%>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id = "container">
<h1>Welcome Page</h1>
<b>Your Login details are as below</b><br>
<%=new Date() %><br>
<%
Employee employee = (Employee)session.getAttribute("loggedInEmployee");
%>
<b>Welcome <%=employee.getFirstName()+""+employee.getLastName() %></b>
<a href = "logout.jsp" class = "button">Logout</a>
<br>
<table>
<tr>
<th>USER ID</th>
<th>FIRST NAME</th>
<th>MIDDLE NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
</tr>
<%EmployeeService employeeService = new EmployeeServiceImpl();
List<Employee> employeeList = employeeService.getListOfEmployees();
for(Employee emp: employeeList){
%>
<tr>
<td><%=emp.getUserId() %></td>
<td><%=emp.getFirstName() %></td>
<td><%=emp.getMiddleName() %></td>
<td><%=emp.getLastName() %></td>
<td><%=emp.getEmail() %></td>
</tr>
<%} %>
</table>
</div>
</body>
</html>