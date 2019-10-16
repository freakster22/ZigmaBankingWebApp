package com.zigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zigma.daos.CustomerDao;
import com.zigma.entities.Customer;

@Service 
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> findAllCustomers() 
	{
		
		return customerDao.getAll();
	}
	@Override
	public Customer findCustomerById(int crn) {
		// TODO Auto-generated method stub
		return customerDao.getById(crn);
	}
	

	@Override
	public void updateCustomer(Customer customer) 
	{		
		customerDao.update(customer);
	}

	
	
}

