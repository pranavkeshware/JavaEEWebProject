package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;

public class GetInstructorCoursesDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(Course.class)
        		.buildSessionFactory();
        
        Session session = factory.openSession();
        try {
        session.beginTransaction();
        
        //get the instructor from db
        
        int theId=4;
        
        Instructor tempInstructor=session.get(Instructor.class,theId);
        System.out.println("Instructor:" + tempInstructor);
        
        
        //get courses for the instructor
        System.out.println("Courses : "+tempInstructor.getCourses());
      //commit transaction
        session.getTransaction().commit();
        System.out.println("Done");
        
        }finally {
        	//add cleanup code
        	session.close();
        	factory.close();
        }
	}
}
