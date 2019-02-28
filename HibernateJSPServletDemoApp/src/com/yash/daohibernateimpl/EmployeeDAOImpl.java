package com.yash.daohibernateimpl;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yash.dao.EmployeeDAO;
import com.yash.hibernate.util.HibernateUtil;
import com.yash.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public boolean insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.openSession();
		if(isEmployeeExist(employee))return false;
		Transaction  tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(employee);
			tx.commit();
		}
		catch (HibernateException ex) {
			if(tx!= null) {
				tx.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			session.close();
		}
		return true;
	}

	@Override
	public void updateEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(String userId) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		Employee employee = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Employee where userId = '"+userId+"'");
					employee = (Employee)query.uniqueResult();
			tx.commit();
					
		}
		catch (HibernateException ex) {
			if(tx!=null) {
				tx.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			session.close();
		}
		return employee;
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<>();
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			employeeList= session.createQuery("from Employee").list();
			tx.commit();
					
		}
		catch (HibernateException ex) {
			if(tx!=null) {
				tx.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			session.close();
		}
		return employeeList;
	
	}

	@Override
	public boolean isEmployeeExist(Employee employee) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.openSession();
		boolean result=false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Employee where userId='"+employee.getUserId()+"'");
			Employee emp = (Employee)query.uniqueResult();
			tx.commit();
			if(emp!=null)result = true;
					
		}
		catch (HibernateException ex) {
			if(tx!=null) {
				tx.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			session.close();
		}
		return result;
	
	}

	@Override
	public boolean authenticateEmployee(String userId, String password) {
		// TODO Auto-generated method stub
		Employee employee = getEmployeeById(userId);
		if(employee!=null && employee.getUserId().equals(userId) && employee.getPassword().equals(password)) {
		return true;
	}
		else {
			return false;
		}
	}
}
