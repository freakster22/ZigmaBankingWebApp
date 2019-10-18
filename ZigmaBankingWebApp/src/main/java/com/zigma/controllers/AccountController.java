package com.zigma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zigma.entities.Account;
import com.zigma.services.AccountService;

@RestController
public class AccountController {
	
	
	@Autowired
	private AccountService accountService;


	@GetMapping("/cust/{id}")
	public Account findAccountByAccountNo(long accountNo) {
		return accountService.findAccountByAccountNo(accountNo);
	}

	@PutMapping("/cust/update")
	public String update(Account account) {
		//if(productService.findProductId(product.getProductId())!=null) {
		if (accountService.findAccountByAccountNo(account.getAccountNo())!=null) {
			accountService.update(account);

			return "account updated successfuly :" + account.getAccountNo();
		} else {
			return "sorry account not found!";
		}
	}

}
