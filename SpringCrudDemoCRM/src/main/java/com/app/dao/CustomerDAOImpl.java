package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    
	
	//need to inject the session factory
	@Autowired
	private SessionFactory SessionFactory;
	
	public CustomerDAOImpl(SessionFactory sessionFactory)
	{
	  super();
	  this.SessionFactory=SessionFactory;
	}
	
	@Override
	public List<Customer> getCustomers()
	{
		// TODO Auto-generated method stub
		
		//get current hibernate session
		Session CurrentSession= SessionFactory.getCurrentSession();
		//create a query ... sort by last name
		Query<Customer> query = CurrentSession.createQuery("from Customer order by lastName", Customer.class);
		
		//execute query and get result
		
		List<Customer> customers = query.getResultList();
		
		//return result
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer)
	{
	  //get current hibernate session
	  Session CurrentSession = SessionFactory.getCurrentSession();
	  
	  //save the customer
	  CurrentSession.saveOrUpdate(theCustomer);
	}
	@Override
	public Customer getCustomers(int theId) 
	{
		
		Session CurrentSession= SessionFactory.getCurrentSession();
		Customer theCustomer = CurrentSession.get(Customer.class, theId);
		return theCustomer;
	}
	public boolean deleteCustomer(int theId)
	{
		Session CurrentSession= SessionFactory.getCurrentSession();
		Customer theCustomer= getCustomers(theId);
		try {
		CurrentSession.delete(theCustomer);
		return true;
		}catch(Exception e){
		return false;}
	}
}
