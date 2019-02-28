package com.yash.hibtest.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yash.hibtest.model.Project;

public class ApplicationTest {
public static void main(String[] args) {
	Project project = new Project();
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save("InternalProject");
	session.save("ExternalProject");
	session.getTransaction().commit();
	session.close();
	
}
}
