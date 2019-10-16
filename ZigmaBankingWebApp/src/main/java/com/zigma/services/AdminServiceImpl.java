package com.zigma.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zigma.daos.AdminDao;
import com.zigma.daos.AdminDaoImpl;
import com.zigma.entities.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	public AdminServiceImpl() {
		// TODO Auto-generated constructor stub
		adminDao = new AdminDaoImpl();
	}

	@Override
	public Admin findAdminById(int adminId) {
		// TODO Auto-generated method stub
		return adminDao.getById(adminId);
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.insert(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.update(admin);
	}

	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.delete(admin);
	}

	@Override
	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		return adminDao.getAll();
	}


}
