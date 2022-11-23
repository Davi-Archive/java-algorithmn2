package entities;

import exceptions.DomainException;

public class Account {

	private int number;
	private String holder;
	private double initialBalance;
	private double withdrawLimit;

	public Account(int number, String holder, double initialBalance, double withdrawLimit) throws DomainException {
		if(initialBalance<=0) {
			throw new DomainException("O valor inicial da conta precisa ser maior que zero.");
		}
		this.number = number;
		this.holder = holder;
		this.initialBalance = initialBalance;
		this.withdrawLimit = withdrawLimit;
	}

	public double deposit(double amount) throws DomainException {
		if(amount<=0) {
			throw new DomainException("O deposito deve ser maior que zero. ");
		}
		return setInitialBalance(getInitialBalance() + amount);
		
	}

	public double withdraw(double amount) throws DomainException {
		if (initialBalance <= 0) {
			throw new DomainException("Deve existir saldo para ser feito o saque.");
		}
		if (withdrawLimit < amount) {
			throw new DomainException("Saque só pode ser feito até " + withdrawLimit);
		}

		return setInitialBalance(getInitialBalance() - amount);

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public double setInitialBalance(double initialBalance) {
		return this.initialBalance = initialBalance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

}
