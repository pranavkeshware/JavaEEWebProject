package com.app.service;

import java.util.List;

import com.app.entity.Customer;


public interface CustomerService {
	
	
	public Customer getCustomer(int theId);
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public boolean deleteCustomer(int theId);

}
