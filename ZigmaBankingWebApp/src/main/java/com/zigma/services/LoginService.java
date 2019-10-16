package com.zigma.services;

import java.util.List;

import com.zigma.entities.Login;

public interface LoginService {

	List<Login> findAllLogin();

	Login findLoginById(int CRN);

	void addLogin(Login login);

	void updateLogin(Login login);
}
