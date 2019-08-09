package com.deloitte.cms.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer)
	{	
		
		customerService.insertCustomer(customer);
	
		return new ModelAndView("success","a",customer);
		
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer)
	{	
		
		customerService.updateCustomer(customer);
	
		return new ModelAndView("success","a",customer);
		
	}
	@RequestMapping("/searchCustomerByIdForm")
	public ModelAndView searchCustomerByIdForm()
	{
			return new ModelAndView("CustomerDetailsById","command",new Customer());
		
	}
	
	@RequestMapping("/searchCustomerById")
	public ModelAndView searchCustomerById(Customer customer)
	{	Customer customer2 = new Customer();
		customer2 = customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("CustomerDetailsById","command",customer2);
		
	}
	
}
