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
import com.zigma.entities.Account;

@Repository
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return (List<Account>) hibernateTemplate.find("from Account");
	}
	
	@Override
	public void update(Account account) {
		hibernateTemplate.update(account);
	}

	@Override
	public Account findAccountByAccountNo(long accountNo) {
		return hibernateTemplate.get(Account.class,accountNo );
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(account);
	}
}
