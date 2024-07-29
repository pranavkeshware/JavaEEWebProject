package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public CustomerServiceImpl(CustomerDAO customerDAO)
	{
		super();
		this.customerDAO=customerDAO;
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() 
	{
		
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) 
	{
	
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) 
	{
		// TODO Auto-generated method stub
		return customerDAO.getCustomers(theId);
	}
	@Transactional
	public boolean deleteCustomer(int theId)
	{
		boolean b= customerDAO.deleteCustomer(theId);
		return b;
	}
}
