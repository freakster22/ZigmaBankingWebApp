package com.zigma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zigma.daos.AccountDao;
import com.zigma.entities.Account;

@Service
@Transactional
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
	public Account findAccountByAccountNo(long accountNo) {
		// TODO Auto-generated method stub
		return accountDao.findAccountByAccountNo(accountNo);
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub
		accountDao.delete(account);
	}

}
