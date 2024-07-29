package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Student.class).buildSessionFactory();
        
        
        Session session = factory.openSession();
        session.beginTransaction();
        
        //save Student
        
        Student s = new Student();
        s.setFirstName("Pranita");
        s.setLastName("Keshware");
        s.setAge(23);
        System.out.println(s);
        session.save(s); 
        
        session.getTransaction().commit();
        session.close();
        factory.close();
        
        
        
        //get student record
//       int id=2;
//        Student s= session.get(Student.class, id);
//        System.out.println(s);
    }
}
