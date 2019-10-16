package com.zigma.exceptions;

public class InSufficientFundsException extends RuntimeException {
	private int fundsAmount;

	public InSufficientFundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InSufficientFundsException(int fundsAmount) {
		super();
		this.fundsAmount = fundsAmount;
	}

	@Override
	public String toString() {
		return "InSufficientFundsException [fundsAmount=" + fundsAmount + "]";
	}

}
