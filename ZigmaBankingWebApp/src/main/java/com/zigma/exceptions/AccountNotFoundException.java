package com.zigma.exceptions;

public class AccountNotFoundException extends Exception {
	private int accountNumber;

	public AccountNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "AccountNotFoundException [accountNumber=" + accountNumber + "]";
	}
	
}
