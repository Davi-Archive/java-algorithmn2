package services;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;

public class BrazilInterestService {
	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}

		return amount * Math.pow(1.0 + interestRate / 100.0, months);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
