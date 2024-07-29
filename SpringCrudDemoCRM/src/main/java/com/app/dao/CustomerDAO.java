package com.app.dao;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerDAO {
	
	public Customer getCustomers(int theId);
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

	public boolean deleteCustomer(int theId);
}
