package com.zigma.services;

import com.zigma.entities.Account;
import com.zigma.exceptions.AccountNotFoundException;
import com.zigma.exceptions.InSufficientFundsException;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public void showBalance(Account AccountTable) {
		// TODO Auto-generated method stub
		//new AccountServiceImpl().showBalance(AccountTable);
	}

	@Override
	public void transferFunds(Account accountSource, Account accountTarget, int transferAmount)
			throws InSufficientFundsException, AccountNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
