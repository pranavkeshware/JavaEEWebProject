package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
		//save or update the employee
		Employee dbEmployee = entityManager.merge(theEmployee);
		
		//update with id from db... so we can get generated id
		theEmployee.setId(dbEmployee.getId());
		
	}

}
