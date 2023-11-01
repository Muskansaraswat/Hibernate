package com.hibernate.ormtool;

import java.io.FileInputStream;
import java.io.IOException;


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
        System.out.println( "Started!" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory(); 
        //Creating Student
        Student st = new Student();
        st.setRoll_no(103);
        st.setName("Aditya");
        st.setAge(23);
        //Reading Image
        FileInputStream fis = new FileInputStream("src/main/java/pic.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        st.setImage(data);
        System.out.println(st);
        
        //Creating Address Class Object
        Address ad = new Address();
        ad.setPincode(335063);
        ad.setCity("Bikaner");
        ad.setState("Rajasthan");
        System.out.println(ad);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println( "Done!" );
        
    }
    
}
