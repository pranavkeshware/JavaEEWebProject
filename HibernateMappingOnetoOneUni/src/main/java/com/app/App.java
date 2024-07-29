package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetail;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory factory = new Configuration()
    			 .configure("Hibernate.cfg.xml")
    			 .addAnnotatedClass(Instructor.class)
    			 .addAnnotatedClass(InstructorDetail.class)
    			 .buildSessionFactory();
    	  
    	  Session session = factory.openSession();
    	 
    	  
    	  try
    	  {
    		  Instructor instructor = new Instructor("Pranav", "Keshware", "pranav@gmail.com");
    		  InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com","singing");
    		  
    		  Instructor instructor1 = new Instructor("Pranita", "Keshware", "pranav@gmail.com");
    		  InstructorDetail instructorDetail1= new InstructorDetail("www.youtube.com","dancing");
    		  
    		  
    		  
    		  //associate the object
    		  instructor.setInstructorDetail(instructorDetail);
    		  instructor1.setInstructorDetail(instructorDetail1);
    		  session.beginTransaction();
    		  session.save(instructor);
    		  session.save(instructor1);
    		  session.getTransaction().commit();
    		  System.out.println("Done!!!");
    		  
    	  }finally {
    		  session.close();
    		  factory.close();
    	  }
    }
}
