package com.yash.blogtest.test;

	
	import java.util.Date;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	import com.yash.blogtest.model.BlogDetail;
	public class InsertOperationTest {

	
	public static void main(String[] args) {
		//1 Get the user from service
		
		BlogDetail blog = new BlogDetail();
		//blog.setId(104);
		blog.setBody("New Blog 1");
		blog.setTitle("Title 5");
		blog.setCreated_at(new Date());
		blog.setUpdated_at(new Date());
		
		//2 Create SessionFactory
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//3 Open session from sessionFactory
		
		Session session = sessionFactory.openSession();
		
		//4 Begin transaction
		
		session.beginTransaction();
		
		//5 Perform transaction
		
		session.save(blog);
		
		//6 Get the transaction and complete
		
		session.getTransaction().commit();
		
		//7 close session
		
		session.close();
	}
	}


