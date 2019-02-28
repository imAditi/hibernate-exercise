package com.yash.service;

import java.util.List;

import com.yash.model.Employee;

public interface EmployeeService {
public boolean authenticateEmployee(String userId, String password);
public Employee getEmployeeByUserId(String userId);
public List<Employee> getListOfEmployees();
public boolean register(Employee employee);
}
