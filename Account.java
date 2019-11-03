package com.se.assignment1;

class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}
	public Account(){}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(int amount){
		balance=balance-amount;
	}
	public void deposit(int amount){
		balance=balance+amount;
	}

}
