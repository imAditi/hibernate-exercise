package com.yash.hibtest.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.osgi.service.useradmin.User;

import com.yash.hibtest.model.Address;
import com.yash.hibtest.model.UserDetail;

public class InsertOperationTest {
public static void main(String[] args) {
	//1 Get the user from service
	Address homeAddress = new Address();
	homeAddress.setHouseNo("421");
	homeAddress.setState("MP");
	homeAddress.setZip("456010");
	homeAddress.setCity("Indore");
	
	Address officeAddress = new Address();
	officeAddress.setHouseNo("441");
	officeAddress.setState("UP");
	officeAddress.setZip("456810");
	officeAddress.setCity("Mirzapur");
	
	UserDetail user = new UserDetail();
	user.setName("Mia");
	user.getAddress();
	
	
	System.out.println("Final result");
	
	//2 Create SessionFactory
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	//3 Open session from sessionFactory
	
	Session session = sessionFactory.openSession();
	
	//4 Begin transaction
	
	session.beginTransaction();
	
	//5 Perform transaction
	
	session.save(user);
	
	//6 Get the transaction and complete
	//user = (UserDetail)session.get(User.class, 1);
	session.getTransaction().commit();
	
	//7 close session
	
	session.close();
}
}
