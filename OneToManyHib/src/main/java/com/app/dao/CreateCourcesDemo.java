package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;

public class CreateCourcesDemo {
	
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
        Instructor tempInstructor=session.get(Instructor.class, theId);
        		
        //create some courses
        Course tempCourse1= new Course("Angular");
        Course tempCourse2= new Course("MERN");
        
        //add  courses to instructor
        tempInstructor.addone(tempCourse1);
        tempInstructor.addone(tempCourse2);
        
        //save the courses
        session.save(tempCourse1);
        session.save(tempCourse2);
        
        //commit transaction
        session.getTransaction().commit();
        System.out.println("Done");
        }
        finally {
        	//add cleanup code
        	session.close();
        	factory.close();
        }
	}
}
