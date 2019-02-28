package com.yash.blogtest.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.blogtest.model.BlogDetail;

public class ReadOperationTest {
	public static void main(String[] args) {
		
		//2 Create SessionFactory
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//3 Open session from sessionFactory
		
		Session session = sessionFactory.openSession();
		
		//4 Begin transaction
		
		session.beginTransaction();
		
		//5 Perform transaction
		
		BlogDetail blog = (BlogDetail)session.get(BlogDetail.class, 3);
		
		//6 Get the transaction and complete
		
		session.getTransaction().commit();
		
		//7 close session
		
		session.close();
		System.out.println("ID : "+blog.getBody());
		System.out.println("Name : "+blog.getId());
		System.out.println("ID : "+blog.getTitle());
		System.out.println("Name : "+blog.getCreated_at());
		System.out.println("ID : "+blog.getUpdated_at());

	}
	}


