package com.hibernateExam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) 
	{
		Customer customer = new Customer();
		customer.setName("Bhakti");
		//customer.setAddress("Chicalim");
		
		BillTotal total = new BillTotal();
		total.setbill_id(1);
		total.setTotal_amount(60.0);
		
		total.setCustomer(customer);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession(); 
		session.beginTransaction();
		
		//session.save(customer);
		session.save(total);
		
		session.getTransaction().commit();
		sessionFactory.close();
		session.close();
		

	}

}
