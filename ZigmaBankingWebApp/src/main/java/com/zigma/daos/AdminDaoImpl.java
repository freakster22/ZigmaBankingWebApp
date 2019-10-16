package com.zigma.daos;

/**
 * @author Dipankar Chakraborty
 * @creation_date 5th Oct 2019 6:00PM
 * @modification_date 5th Oct 2019 6:00PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a Dao Interface and used in persistence layer.
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zigma.entities.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return (List<Admin>) hibernateTemplate.find("from Admin");
	}

	public Admin getById(int adminId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Admin.class, adminId);
	}

	public void insert(Admin admin) {
		hibernateTemplate.save(admin);
	}

	public void update(Admin admin) {
		hibernateTemplate.update(admin);
	}

	public void delete(Admin admin) {
		hibernateTemplate.delete(admin);
	}
}
