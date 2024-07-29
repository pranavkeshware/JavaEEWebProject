package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// need to inject our customer service
	@Autowired
	private CustomerService customerService;

//	public CustomerController(CustomerService customerService) {
//		super(); 
//		this.customerService = customerService;
//	}

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();

		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";// WEB-INF/views/list-customer.jsp
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// creat a model attribute to bind from data
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		// save the customer using our service
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int theId, Model theModel)
	{
		Customer theCustomer = customerService.getCustomer(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}	
	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("customerId") int theId, Model theModel)
	{
		boolean b= customerService.deleteCustomer(theId);
		
		
		// get customers from the service
				List<Customer> theCustomers = customerService.getCustomers();

				// add the customers to the model
				theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
}
