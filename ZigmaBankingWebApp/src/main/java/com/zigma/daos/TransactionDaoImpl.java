package com.zigma.daos;

/**
 * @author Dipankar Chakraborty
 * @creation_date 5th Oct 2019 6:00PM
 * @modification_date 5th Oct 2019 6:00PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Dao Interface and used in persistence layer.
 */

import com.zigma.entities.Account;
import com.zigma.exceptions.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void showBalance(Account AccountTable) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferFunds(Account accountSource, Account accountTarget, int transferAmount)
			throws AccountNotFoundException {
		// TODO Auto-generated method stub
		
	}}

	
	/* @Override
	 * public void showBalance(Account AccountTable) throws AccountNotFoundException
	 *
	 * { // TODO Auto-generated method stub
	 * if(AccountNumberCheckUtil.accountExists(AccountTable)){
	 * System.out.println("The available balance is "+AccountTable.getTotalBalance()
	 * ); } else{ throw new AccountNotFoundException(AccountTable.getAccountNo()); }
	 * 
	 * }
	

	@Override
	public void transferFunds(Account accountSource, Account accountTarget, int transferAmount)
			throws AccountNotFoundException {
		// TODO Auto-generated method stub
		double sourceBalance = accountSource.getTotalBalance();
		double targetBalance = accountTarget.getTotalBalance();
		if(AccountNumberCheckUtil.accountExists(accountSource) && AccountNumberCheckUtil.accountExists(accountTarget)){
			if(transferAmount<sourceBalance){
				sourceBalance = sourceBalance - transferAmount;
				targetBalance = targetBalance + transferAmount;
				accountSource.setTotalBalance(sourceBalance);
				accountTarget.setTotalBalance(targetBalance);
			}
			else
				throw new InSufficientFundsException(transferAmount);
		}
		else{
			if(AccountNumberCheckUtil.accountExists(accountSource))
				throw new AccountNotFoundException(accountTarget.getActNumber());
			else
				throw new AccountNotFoundException(accountSource.getActNumber());
		}

	}

}
*/