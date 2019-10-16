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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zigma.entities.Beneficiary;

@Repository
public class BeneficiaryDaoImpl implements BeneficiaryDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Beneficiary> getAll() {
		return (List<Beneficiary>) hibernateTemplate.find("from Beneficiary");
	}

	@Override
	public Beneficiary getById(int crn) {
		return hibernateTemplate.get(Beneficiary.class, crn);
	}

	@Override
	public void insert(Beneficiary beneficiary) {
		hibernateTemplate.save(beneficiary);
	}

	@Override
	public void update(Beneficiary beneficiary) {
		hibernateTemplate.update(beneficiary);
	}

	@Override
	public void delete(Beneficiary beneficiary) {
		hibernateTemplate.delete(beneficiary);
	}

}
