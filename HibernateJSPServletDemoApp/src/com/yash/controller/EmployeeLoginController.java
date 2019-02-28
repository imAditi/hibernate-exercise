package com.yash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.Employee;
import com.yash.service.EmployeeService;
import com.yash.serviceimpl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeLoginController
 */
@WebServlet("/EmployeeLoginController")
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		EmployeeService employeeService = new EmployeeServiceImpl();
		boolean result = employeeService.authenticateEmployee(userId, password);
		Employee loggedInEmployee = employeeService.getEmployeeByUserId(userId);
		if(result == true) {
			request.getSession().setAttribute("loggedInEmployee", loggedInEmployee);
			response.sendRedirect("./welcome.jsp");
			
		}
		else {
			response.sendRedirect("./error.jsp");
		}
		
	}

}
