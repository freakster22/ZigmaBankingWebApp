package com.zigma.services;

import java.util.List;

import com.zigma.daos.LoginDao;
import com.zigma.daos.LoginDaoImpl;
import com.zigma.entities.Login;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;

	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}

	@Override
	public List<Login> findAllLogin() {
		return loginDao.getAll();
	}

	@Override
	public Login findLoginById(int crn) {
		Login login = loginDao.getById(crn);
		return login;
	}

	@Override
	public void addLogin(Login login) {
		loginDao.insert(login);
	}

	@Override
	public void updateLogin(Login login) {
		loginDao.update(login);

	}

}
