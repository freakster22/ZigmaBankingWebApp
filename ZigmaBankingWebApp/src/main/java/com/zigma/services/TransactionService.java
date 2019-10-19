package com.zigma.services;

import com.zigma.entities.Account;
import com.zigma.entities.Beneficiary;
import com.zigma.exceptions.AccountNotFoundException;
import com.zigma.exceptions.InSufficientFundsException;

public interface TransactionService {
	public double showBalance(Account account) throws AccountNotFoundException;

	public double transferFunds(Account account, Beneficiary beneficiary, double transferAmount)
			throws InSufficientFundsException, AccountNotFoundException;
}
