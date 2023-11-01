package com.hibernate.ormtool.onetomany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Bank_Details {
	public static void main( String[] args ) 
    {
	 	System.out.println( "Started!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
		
//		  Person p1 = new Person(); 
//		  p1.setAadharNumber(8765);
//		  p1.setAccountHolderName("Rampyaari"); 
//		  p1.setDob(new Date());
//		  
//		  BankAccounts account1 = new BankAccounts(); 
//		  account1.setAccountId(121);
//		  account1.setAccountNumber(409234);
//		  account1.setBankName("State Bank of India"); 
//		  account1.setPerson(p1);
//		  
//		  BankAccounts account2 = new BankAccounts(); 
//		  account2.setAccountId(122);
//		  account2.setAccountNumber(678543); 
//		  account2.setBankName("Bank of Baroda");
//		  account2.setPerson(p1);
//		  
//		  BankAccounts account3 = new BankAccounts(); 
//		  account3.setAccountId(126);
//		  account3.setAccountNumber(897656); 
//		  account3.setBankName("HDFC Bank");
//		  account3.setPerson(p1);
//		  
//		  BankAccounts account4 = new BankAccounts(); 
//		  account4.setAccountId(190);
//		  account4.setAccountNumber(672130); 
//		  account4.setBankName("Axis Bank");
//		  account4.setPerson(p1);
//		  
//		  List<BankAccounts> list = new ArrayList<BankAccounts>(); 
//		  list.add(account1);
//		  list.add(account2); 
//		  list.add(account3); 
//		  list.add(account4);
//		  p1.setBankAccounts(list);
//		 
        
        Session session = factory.openSession();
        //inserting into db
          Transaction tx = session.beginTransaction();
		
//		  session.save(p1); 
//		  session.save(account1); 
//		  session.save(account2);
//		  session.save(account3); 
//		  session.save(account4);
		//Fetch Technique -> Lazy ,Eager
          Person p = (Person)session.get(Person.class,8765);
          System.out.println(p.getAccountHolderName());
          System.out.println(p.getAadharNumber());
          System.out.println(p.getBankAccounts().size());
          tx.commit();
        
        //fetching
		/*
		 * Person person = (Person)session.get(Person.class,8765);
		 * System.out.println(person.getAccountHolderName()); for(BankAccounts
		 * accounts:person.getBankAccounts()) {
		 * System.out.println(accounts.getBankName()); }
		 */
        session.close();
        factory.close();
	}

}
