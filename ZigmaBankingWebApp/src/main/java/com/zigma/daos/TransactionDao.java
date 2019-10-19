package com.zigma.daos;

import java.util.List;

import com.zigma.entities.Account;
import com.zigma.entities.Transaction;

public interface TransactionDao {
	
public Boolean save(Transaction transaction);
public List<Account> getBalanceByAccountNo(long accountNo);
	
	public List<Transaction> getById(long accountNo);
}
