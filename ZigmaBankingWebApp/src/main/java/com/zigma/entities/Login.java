package com.zigma.entities;

/**
 * @author Dipankar Chakraborty
 * @creation_date 5th Oct 2019 6:00PM
 * @modification_date 5th Oct 2019 6:00PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a POJO Class.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(nullable = false, columnDefinition = "varchar(20) default 'password123'")
	private String password;

	@OneToOne(mappedBy = "login")
	@JsonIgnore
	private Customer customer;

	@OneToOne(mappedBy = "login")
	@JsonIgnore
	private Admin admin;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", password=" + password + ", customer=" + customer + ", admin=" + admin + "]";
	}

}
