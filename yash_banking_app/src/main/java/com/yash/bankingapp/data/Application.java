package com.yash.bankingapp.data;

import java.util.Date;

import org.hibernate.Session;

import com.yash.bankingapp.domain.User;

public class Application {
public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.getTransaction().begin();
	User user = new User();
	user.setFirstName("Aditi");
	user.setLastName("Jain");
	user.setBirthDate(new Date());
	user.setEmailAddress("aditi.jain@yash.com");
	user.setCreatedBy("Aditi");
	user.setCreatedDate(new Date());
	user.setLastUpdatedDate(new Date());
	user.setLastUpdatedBy("Aditi");
	session.saveOrUpdate(user);
	session.getTransaction().commit();
	session.close();
}

}

