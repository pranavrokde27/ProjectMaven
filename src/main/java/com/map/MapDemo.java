package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        //Creating Object OF Question
        Question q1 = new Question();
        q1.setQuestionID(1001);
        q1.setQuestion("WHAT IS JAVA ?");
 		
        
        Question q2 = new Question();
        q1.setQuestionID(1002);
        q1.setQuestion("WHAT IS OOPS ?");
        
        //Creating Answer Obj
        Answer ans1 = new Answer();
        ans1.setAnswerId(2001);
        ans1.setAnswer("JAVA IS FUN");
        ans1.setQuestion(q1);
        q1.setAnswer(ans1);
        
        
        Answer ans2 = new Answer();
        ans2.setAnswerId(2002);
        ans2.setAnswer("OOPS IS VARIOUS");
        ans2.setQuestion(q2);
        q1.setAnswer(ans2);
        
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(q1);
        session.save(ans1);
        
        session.save(q2);
        session.save(ans2);
        
        tx.commit();
        session.close();
        
        sessionFactory.close();
	}

}
