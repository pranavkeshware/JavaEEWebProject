package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

public class EmployeeDao {
	
	public static int saveEmployee(Employee e)

	{
		int i;
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.openSession();
	    session.beginTransaction();
	    i=(int) session.save(e);
	    session.getTransaction().commit();
	    session.close();
	    factory.close();
		return i;
		
	}
}
