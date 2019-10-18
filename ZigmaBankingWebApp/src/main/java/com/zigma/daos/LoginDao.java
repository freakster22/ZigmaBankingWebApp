package com.zigma.daos;

import java.util.List;

import com.zigma.entities.Login;

public interface LoginDao {
	Login getById(long crn);

	void insert(Login login);

	void update(Login login);

	List<Login> getAll();

}
