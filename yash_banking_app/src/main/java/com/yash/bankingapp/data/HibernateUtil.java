package com.yash.bankingapp.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();

private static SessionFactory buildSessionFactory() {
	try {
	Configuration configuration = new Configuration();
	configuration.addAnnotatedClass(com.yash.bankingapp.domain.User.class);
	return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
	}
catch (Exception e) {
	e.printStackTrace();
	throw new RuntimeException("SessionFactory Created Failed");
}
}
public static SessionFactory getSessionFactory() {
	return sessionFactory;
}
}
