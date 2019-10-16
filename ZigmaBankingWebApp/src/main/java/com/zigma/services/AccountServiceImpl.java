package com.zigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zigma.daos.AccountDao;
import com.zigma.entities.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Account> findAllAccounts() {

		return accountDao.getAll();
	}

	@Override
	public void update(Account account) {
		accountDao.update(account);
	}

	@Override
	public Account findAccountByCrn(int crn) {
		// TODO Auto-generated method stub
		return accountDao.getById(crn);
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub
		accountDao.delete(account);
	}

}
