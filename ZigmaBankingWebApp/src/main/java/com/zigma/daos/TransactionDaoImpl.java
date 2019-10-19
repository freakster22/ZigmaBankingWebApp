package com.zigma.daos;

import com.zigma.entities.Account;

/**
 * @author Dipankar Chakraborty
 * @creation_date 5th Oct 2019 6:00PM
 * @modification_date 5th Oct 2019 6:00PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Dao Interface and used in persistence layer.
 */

import com.zigma.entities.Transaction;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public Boolean save(Transaction transaction) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Transaction> getById(long accountNo) {
		// TODO Auto-generated method stub
		return (List<Transaction>) hibernateTemplate.find("from Transaction");
	}

	@Override
	public List<Account> getBalanceByAccountNo(long accountNo) {
		// TODO Auto-generated method stub
		return (List<Account>) hibernateTemplate.find("from Account");
	}


	
}