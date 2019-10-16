package com.zigma.services;

import java.util.List;

import com.zigma.entities.Customer;

public interface CustomerService
{
List<Customer> findAllCustomers();
	
	Customer findCustomerById(int CRN);
	
	void updateCustomer(Customer customer);
}
