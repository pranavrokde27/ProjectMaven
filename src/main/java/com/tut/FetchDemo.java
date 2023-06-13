package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get , load
		 Configuration cfg =  new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory sessionFactory = cfg.buildSessionFactory();
	     Session session = sessionFactory.openSession();
	     
	     //get-student:101 (Student)
//	     Student student=(Student)session.get(Student.class, 101);
//	     System.out.println(student);
	     
	     Address address = (Address)session.get(Address.class, 1);
	     System.out.println(address.getCity());
	     
	     
	     
	     
	     session.close();
	     sessionFactory.close();
	}

}
