package com.yash.blogtest.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.blogtest.model.BlogDetail;


public class ListAllTest {
public static void main(String[] args) {
		
		//2 Create SessionFactory
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//3 Open session from sessionFactory
		
		Session session = sessionFactory.openSession();
		
		//4 Begin transaction
		
		session.beginTransaction();
		
		//5 Perform transaction
		
		Query query = session.createQuery("from BlogDetail");
		List<BlogDetail> users = query.list();
		//6 Get the transaction and complete
		
		session.getTransaction().commit();
		
		//7 close session
		
		session.close();
		System.out.println("---------------blog detail-----------------");
		for (BlogDetail blogs : users) 
		{
			System.out.println("Id:"+blogs.getId() +"----"+"Body:"+blogs.getBody() +"---"+"Title:"+blogs.getTitle() +"----"+"Created_at:"+blogs.getCreated_at()+"---"+"Updated_at:"+blogs.getUpdated_at());
			System.out.println("----------------------------------");
		}
		
	}
}