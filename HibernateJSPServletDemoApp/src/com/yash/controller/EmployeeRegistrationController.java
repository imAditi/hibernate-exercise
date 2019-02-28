package com.yash.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.Employee;
import com.yash.service.EmployeeService;
import com.yash.serviceimpl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeRegistrationController
 */
@WebServlet("/EmployeeRegistrationController")
public class EmployeeRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		Employee employee = new Employee(firstName, middleName, lastName, email,userId, password);
		try {
			
			EmployeeService employeeService = new EmployeeServiceImpl();
			boolean result = employeeService.register(employee);
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Successful Registration </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");
			if(result) {
				out.println("<h1> Thanks for your registration </h1>");
				out.println("To Login with userId and password <a href = 'login.jsp'>Click Here</a>");
			}else {
				out.println("<h1> Registration Failed </h1>");
				out.println("To try again <a href = 'register.jsp'>Click Here</a>");
			}
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		}
		finally {
			out.close();
		}
	}

}
