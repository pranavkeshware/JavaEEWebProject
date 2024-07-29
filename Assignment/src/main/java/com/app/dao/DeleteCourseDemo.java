package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;
import com.app.entity.InstructorDetail;

public class DeleteCourseDemo {
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
	    	 int theId = 1;
	    	 Course tempCourse=session.get(Course.class, theId);
	    	 System.out.println("delete course = "+tempCourse);
	    	 session.delete(tempCourse);
	    	 session.getTransaction().commit();
	    	 System.out.println("Done!");
}
	     finally {
	    	 session.close();
	    	 factory.close();
	     }
	}
}
	     
