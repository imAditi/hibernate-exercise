package com.yash.hibtest.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.yash.hibtest.model.UserDetail;

public class ListAllTest {
public static void main(String[] args) {
		
		//2 Create SessionFactory
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//3 Open session from sessionFactory
		
		Session session = sessionFactory.openSession();
		
		//4 Begin transaction
		
		session.beginTransaction();
		
		//5 Perform transaction
		
		Query query = session.createQuery("from UserDetail");
		List<UserDetail> users = query.list();
		//6 Get the transaction and complete
		
		session.getTransaction().commit();
		
		//7 close session
		
		session.close();
		System.out.println("---------------user detail-----------------");
		for (UserDetail user : users) {
			System.out.println("Id:"+user.getId() +"----"+"Name:"+user.getName());
			System.out.println("----------------------------------");
		}
		
	}
}
