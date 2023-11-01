package com.hibernate.ormtool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main( String[] args )
    {
        System.out.println( "Started!" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory(); 
        //creating question
        Question question = new Question();
        question.setQuestion_Id(1212);
        question.setQuestion("What is Java");
        
        //creating answer
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is a programming language");
        answer.setQuestion(question);
        //------------------------
        question.setAnswer(answer);
        System.out.println(question);
        
        Question question1 = new Question();
        question1.setQuestion_Id(242);
        question1.setQuestion("What is Collection Framework");
        
        Answer answer1 = new Answer();
        answer1.setAnswerId(344);
        answer1.setAnswer("API to work with objects in Java.");
        answer1.setQuestion(question1);
        //-------------------------
        question1.setAnswer(answer1);
        System.out.println(question1);
        
        Session session = factory.openSession();
        //inserting into db
        Transaction tx = session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(question1);
        session.save(answer1);
        tx.commit();
        //fetching from db
        Question q = (Question)session.get(Question.class,1212);
        System.out.println(q.getQuestion()+"\n"+q.getAnswer().getAnswer());
        session.close();
        factory.close();
        
    }
	
}
