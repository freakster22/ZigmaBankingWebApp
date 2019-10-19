package com.zigma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zigma.entities.Account;
import com.zigma.entities.Beneficiary;
import com.zigma.exceptions.AccountNotFoundException;
import com.zigma.exceptions.InSufficientFundsException;
import com.zigma.services.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/balance")
	  public double showBalance(Account account) throws AccountNotFoundException
	  {
		return transactionService.showBalance(account);
	  }
	
@PostMapping("/transfer")
	public double transferFunds(Account account, Beneficiary beneficiary, double transferAmount)
			throws InSufficientFundsException, AccountNotFoundException
	{
	return transactionService.transferFunds(account, beneficiary, transferAmount);
	}
	
}
