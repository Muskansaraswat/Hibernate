package com.hibernate.ormtool.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	 public static void main( String[] args ) 
	    {
		 //get,load
		 	System.out.println( "Started!" );
	        Configuration cfg = new Configuration();
	        cfg.configure();
	        SessionFactory factory = cfg.buildSessionFactory(); 
	        Emp e1 = new Emp();
	        e1.setEid(12);
	        e1.setName("Urvisha");
	        
	        Emp e2 = new Emp();
	        e2.setEid(13);
	        e2.setName("Tarun");
	       
	        
	        Project p1 = new Project();
	        p1.setPid(30);
	        p1.setProjectName("Library Management");
	        
	        Project p2 = new Project();
	        p2.setPid(20);
	        p2.setProjectName("CHATBOT");
	        
	        
	        List<Emp> list1 = new ArrayList<Emp>();
	        list1.add(e1);
	        list1.add(e2);
	        List<Project> list2 = new ArrayList<Project>();
	        list2.add(p1);
	        list2.add(p2);
	        
	        e1.setProjects(list2);
	        //e2.setProjects(list2);
	        p2.setEmps(list1);
	        //p2.setEmps(list1);
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        //objects save:
	        session.save(e1);
	        session.save(e2);
	        session.save(p1);
	        session.save(p2);
	        tx.commit();
	        session.close();
	        System.out.println( "Done!" );
	        
	    }
}
