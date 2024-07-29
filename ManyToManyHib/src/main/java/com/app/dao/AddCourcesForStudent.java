package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.app.entity.Course;
import com.app.entity.Student;

public class AddCourcesForStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
	    		.configure("hibernate.cfg.xml")
	    		.addAnnotatedClass(Student.class)
	    		.addAnnotatedClass(Course.class)
	    		.buildSessionFactory();
	    
	    Session session = factory.openSession();
	
    try{
    	session.beginTransaction();
    	
//        Student tempStudent1 = new Student("guru", "raj" ,"abc@gmail.com");
//        Student tempStudent2 = new Student("pranav", "keshware" ,"xyz@gmail.com");
//        
//        
//        Course tempCourse1= new Course("Java");
//        Course tempCourse2= new Course("Python");
        
        
//        session.save(tempStudent1);
//        session.save(tempStudent2);
//        
//        session.save(tempCourse1);
//        session.save(tempCourse2);
    	
          Student tmpStudent1=session.get(Student.class,1);
          Student tmpStudent2=session.get(Student.class,2);
          
          Course tempCourse1=session.get(Course.class,1);
          Course tempCourse2=session.get(Course.class,2);
          
          tmpStudent1.addCourse(tempCourse1);
          tmpStudent1.addCourse(tempCourse2);
          tmpStudent2.addCourse(tempCourse1);
          tmpStudent2.addCourse(tempCourse2);
          
         
          
          session.save(tmpStudent1);
          session.save(tmpStudent2);
          session.getTransaction().commit();
        
    }finally {
    	session.close();
        factory.close();
    }
  }
}
