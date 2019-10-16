package com.zigma.daos;

import java.util.List;

import com.zigma.entities.Admin;

public interface AdminDao {
	List<Admin> getAll();

	Admin getById(int adminId);

	void insert(Admin admin);

	void update(Admin admin);

	void delete(Admin admin);
}
