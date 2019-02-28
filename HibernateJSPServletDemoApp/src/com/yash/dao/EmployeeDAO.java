package com.yash.dao;

import java.util.List;

import com.yash.model.Employee;

public interface EmployeeDAO {
public boolean insertEmployee(Employee employee);
public void updateEmployee(long id);
public void deleteEmployee(long id);
public Employee getEmployeeById(String userId);
public List<Employee> showAllEmployees();
public boolean isEmployeeExist(Employee employee);
public boolean authenticateEmployee(String userId, String password);
}
