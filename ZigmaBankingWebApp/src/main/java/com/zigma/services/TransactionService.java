package com.zigma.services;

import com.zigma.entities.Account;
import com.zigma.exceptions.AccountNotFoundException;
import com.zigma.exceptions.InSufficientFundsException;

public interface TransactionService {
	public void showBalance(Account AccountTable);

	public void transferFunds(Account accountSource, Account accountTarget, int transferAmount)
			throws InSufficientFundsException, AccountNotFoundException;

}
