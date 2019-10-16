package com.zigma.entities;

/**
 * @author Dipankar Chakraborty
 * @creation_date 5th Oct 2019 6:00PM
 * @modification_date 5th Oct 2019 6:00PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is a POJO Class.
 */

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactId;

	private int tPin;
	private String crn;
	@OneToOne
	@JoinColumn(name = "beneficiaryId")
	private Beneficiary beneficiary;

	private double amount;
	private LocalDate dateTime;
	@ManyToOne
	@JoinColumn(name = "accountId")
	private Account account;

	public int getTransactId() {
		return transactId;
	}

	public void setTransactId(int transactId) {
		this.transactId = transactId;
	}

	public int gettPin() {
		return tPin;
	}

	public void settPin(int tPin) {
		this.tPin = tPin;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Transaction [transactId=" + transactId + ", tPin=" + tPin + ", crn=" + crn + ", beneficiary="
				+ beneficiary + ", amount=" + amount + ", dateTime=" + dateTime + ", account=" + account + "]";
	}
}
