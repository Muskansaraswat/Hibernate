package com.hibernate.ormtool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	 public static void main( String[] args ) 
	    {
		 //get,load
		 	System.out.println( "Started!" );
	        Configuration cfg = new Configuration();
	        cfg.configure();
	        SessionFactory factory = cfg.buildSessionFactory(); 
	        Session session = factory.openSession();
	        Student student = (Student)session.get(Student.class,103);
	        System.out.println(student.getName());
	        Student student1 = (Student)session.get(Student.class,103);
	        System.out.println(student1.getAge());
	        Address address = (Address)session.load(Address.class,335063);
	        System.out.println(address.getPincode()+" "+address.getCity());
	        session.close();
	        factory.close();
		 
	    }

}
