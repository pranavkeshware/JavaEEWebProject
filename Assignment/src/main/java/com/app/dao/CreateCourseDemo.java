package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;
import com.app.entity.InstructorDetail;

public class CreateCourseDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Instructor.class)
    			.addAnnotatedClass(InstructorDetail.class)
    			.addAnnotatedClass(Course.class)
    			.buildSessionFactory();
        
        Session session=factory.getCurrentSession();
        try {
        	
        	session.beginTransaction();
//        	Instructor instructor = new Instructor("Priti","Kolkar","priti@gmail.com");
//        	InstructorDetail instructorDetail = new InstructorDetail("http://www.mno.com//youtube","reading");
//        	instructor.setInstructorDetail(instructorDetail);
//        	session.beginTransaction();
//        	session.save(instructor);
        	int theId=1;
        	Instructor tempInstructor=session.get(Instructor.class, theId);
        	Course tempCourse1=new Course("Angular");
        	Course tempCourse2=new Course("MERN");
        	tempInstructor.addone(tempCourse1);
        	tempInstructor.addone(tempCourse2);
        	session.save(tempCourse1);
        	session.save(tempCourse2);
//        	session.getTransaction().commit();
        	System.out.println("Done!");
        }
        finally {
        	session.close();
        	factory.close();
        }
}
}
