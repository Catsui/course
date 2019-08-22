package model.entities;

import model.exceptions.OperationException;

public class Account123 {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account123() {
		
	}

	public Account123(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if (withdrawLimit < amount) {
			throw new OperationException ("O valor excede o limite de saque.");
		}
		if (balance < amount) {
			throw new OperationException ("Não há saldo suficiente na conta.");
		}	
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "Novo saldo: $ "
				+ String.format("%.2f%n", balance);
	}
	
	

}
