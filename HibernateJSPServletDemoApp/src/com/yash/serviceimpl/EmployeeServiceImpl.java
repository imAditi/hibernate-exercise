package com.yash.serviceimpl;

import java.util.List;

import com.yash.dao.EmployeeDAO;
import com.yash.daohibernateimpl.EmployeeDAOImpl;
import com.yash.model.Employee;
import com.yash.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO = null;
	public EmployeeServiceImpl() {
		employeeDAO = new EmployeeDAOImpl();
	}

	@Override
	public boolean authenticateEmployee(String userId, String password) {
		// TODO Auto-generated method stub
		return employeeDAO.authenticateEmployee(userId, password);
	}

	@Override
	public Employee getEmployeeByUserId(String userId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(userId);
	}

	@Override
	public List<Employee> getListOfEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.showAllEmployees();
	}

	@Override
	public boolean register(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.insertEmployee(employee);
	}

}
