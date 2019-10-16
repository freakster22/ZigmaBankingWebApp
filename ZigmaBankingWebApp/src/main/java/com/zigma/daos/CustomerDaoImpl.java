package com.zigma.daos;

/**
 * @author Dipankar Chakraborty
 * @creation_date 5th Oct 2019 6:00PM
 * @modification_date 5th Oct 2019 6:00PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Dao Interface and used in persistence layer.
 */

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zigma.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao 
{
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Customer> getAll() {
		return (List<Customer>) hibernateTemplate.find("from Customer");
	}

	@Override
	public Customer getById(int crn) {
		return hibernateTemplate.get(Customer.class, crn);
	}

	@Override
	public void insert(Customer customer) {
		hibernateTemplate.save(customer);
	}

	@Override
	public void update(Customer customer) {
		hibernateTemplate.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		hibernateTemplate.delete(customer);
	}

}
