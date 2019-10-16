package com.zigma.daos;

import com.zigma.entities.Account;
import com.zigma.exceptions.AccountNotFoundException;

public interface TransactionDao {
	public void showBalance(Account AccountTable) throws AccountNotFoundException;
	public void transferFunds(Account accountSource,Account accountTarget,int transferAmount) throws AccountNotFoundException;
}
