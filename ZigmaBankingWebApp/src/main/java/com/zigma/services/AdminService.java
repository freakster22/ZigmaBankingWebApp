package com.zigma.services;

import java.util.List;

import com.zigma.entities.Admin;

public interface AdminService {
	List<Admin> findAllAdmins();

	Admin findAdminById(int adminId);

	void addAdmin(Admin admin);

	void updateAdmin(Admin admin);

	void removeAdmin(Admin admin);
}
