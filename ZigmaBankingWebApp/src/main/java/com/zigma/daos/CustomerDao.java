package com.zigma.daos;

import java.util.List;

import com.zigma.entities.Customer;

public interface CustomerDao {

	List<Customer> getAll();
	
	Customer getById(int CRN);
	
	void insert(Customer customer);
	
	void update(Customer customer);
	
	void delete(Customer customer);
}
