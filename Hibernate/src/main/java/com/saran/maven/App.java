package com.saran.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("calling git333377777");
         Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         
         SessionFactory sf=cfg.buildSessionFactory();
         Session session =sf.openSession();
         Transaction tx=session.beginTransaction();
         Employee e1=new Employee(1,"Subham",12345);
         Employee e2=new Employee(2,"Yousuf",12345);
         Employee e3=new Employee(3,"Mahesh",12345);
         session.save(e1);session.save(e2);session.save(e3);
         tx.commit();
         session.close();
         
         
         
    }
}
