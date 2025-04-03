package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Student;

public class AddStudent {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student stu=new Student();
		stu.setId(2);
		stu.setName("Gayatri");
		stu.setEmail("gayu@gmail.com");
		stu.setAddress("Kolhapur2");
		
		session.save(stu);
		tx.commit();
	}
}
