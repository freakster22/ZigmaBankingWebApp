package com.zigma.services;

import java.util.List;

import com.zigma.entities.Account;

public interface AccountService {

	List<Account> findAllAccounts();

	Account findAccountByCrn(int crn);

	void update(Account account);

	void delete(Account account);
}
