package com.zigma.daos;

import java.util.List;

import com.zigma.entities.Account;

public interface AccountDao {
List<Account> getAll();
	
	Account findAccountByAccountNo(long accountNo);
	
	void update(Account account);
	
	void delete(Account account);

}
