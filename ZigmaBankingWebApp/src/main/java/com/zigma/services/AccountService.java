package com.zigma.services;

import java.util.List;

import com.zigma.entities.Account;

public interface AccountService {

	List<Account> findAllAccounts();

	Account findAccountByAccountNo(long accountNo);

	void update(Account account);

	void delete(Account account);
}
