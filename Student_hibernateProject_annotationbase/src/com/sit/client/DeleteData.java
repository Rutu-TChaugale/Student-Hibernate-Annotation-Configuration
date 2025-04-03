package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Student;

public class DeleteData {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student stu=session.get(Student.class, 2);
	
		
		session.delete(stu);
		tx.commit();
	}

}
