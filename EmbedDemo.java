package com.hibernate.ormtool;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
  
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Started!" );
        Configuration cfg = new Configuration();
        cfg.configure("src/main/java/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        //Creating Student
        Student st = new Student();
        st.setRoll_no(104);
        st.setName("Anushka");
        st.setAge(33);
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Spring Hibernate Course");
        certificate.setDuration("2 months");
        
        st.setCertificate(certificate);
        
        Student st1 = new Student();
        st1.setRoll_no(105);
        st1.setName("Ravi");
        st1.setAge(22);
        
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Spring Boot Course");
        certificate1.setDuration("6 months");
        
        st1.setCertificate(certificate1);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //objects save:
        session.save(st);
        session.save(st1);
        tx.commit();
        session.close();
        System.out.println( "Done!" );
    }

}
