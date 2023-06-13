package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {
	 public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory sessionFactory = cfg.buildSessionFactory();
		 
		 //Creating student object
		 Student st = new Student();
		 st.setId(103);
		 st.setName("NITIN PANCHAL");
		 st.setCity("INDORE, M.P");
		 
		 Student st1 = new Student();
		 st.setId(104);
		 st.setName("JAY CHALKE");
		 st.setCity("RATNAGIRI");
		 
		 Certificate cer = new Certificate();
		 cer.setCourse("PG-DAC");
		 cer.setDuration("7 MONTHS"); 
		 st.setCertificate(cer);
		 Session session = sessionFactory.openSession();
		 Transaction trans = session.beginTransaction();
		 
		 
		 //Object Save
		 session.save(st);
		 session.save(st1);
		 trans.commit();
		 session.close();
		 sessionFactory.close();
	 }
}
