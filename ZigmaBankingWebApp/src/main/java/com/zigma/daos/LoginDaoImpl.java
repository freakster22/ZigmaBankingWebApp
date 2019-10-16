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
import com.zigma.entities.Login;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Login> getAll() {
		// TODO Auto-generated method stub
		return (List<Login>) hibernateTemplate.find("from Login");
	}

	@Override
	public Login getById(int crn) {
		return hibernateTemplate.get(Login.class, crn);
	}

	@Override
	public void insert(Login login) {
		hibernateTemplate.save(login);
	}

	@Override
	public void update(Login login) {
		hibernateTemplate.update(login);
	}
}