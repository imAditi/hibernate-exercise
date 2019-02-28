package com.yash.hibtest.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.hibtest.model.UserDetail;

public class UpdateOperationTest {
public static void main(String[] args) {
		
		//2 Create SessionFactory
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//3 Open session from sessionFactory
		
		Session session = sessionFactory.openSession();
		
		//4 Begin transaction
		
		session.beginTransaction();
		
		//5 Perform transaction
		
		UserDetail user = (UserDetail)session.get(UserDetail.class, 2);
		user.setName("Riya");
		session.update(user);
		//6 Get the transaction and complete
		
		session.getTransaction().commit();
		
		//7 close session
		
		session.close();
		System.out.println("ID : "+user.getId());
		System.out.println("Name : "+user.getName());
	}
	}


