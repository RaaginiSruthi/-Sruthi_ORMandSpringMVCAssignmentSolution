package com.gl.customerRelationshipManagement.service;

import java.util.List;

import com.gl.customerRelationshipManagement.entity.Customer;



public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
