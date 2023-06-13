package com.tut;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        //Creating Student class Object
        Student st = new Student();
//        st.setId(101);
//        st.setName("PRANAV ROKDE");
//        st.setCity("NAGPUR,MAHA");
        
        
        
        
        st.setId(102);
        st.setName("AKSHAY POL");
        st.setCity("SATARA,MAHA");
        
        //CREATING OBJECT OF ADDRSS CLASS
        Address add = new Address();
        add.setStreet("street-2");
		add.setCity("Satara");
		add.setOpen(true);
		add.setAddedDate(new Date());
		add.setX(1234.234);
		
		//Reading Image
		FileInputStream  fis = new FileInputStream("src/main/java/abc.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		add.setImage(data);
        
        
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        session.save(add);
        tx.commit();
        session.close();
        System.out.println("Done..");
        
        
        
//        System.out.println(sessionFactory);
//        sessionFactory.close();
//        System.out.println(sessionFactory.isClosed());
    }
}
