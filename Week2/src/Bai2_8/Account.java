package Bai2_8;

import java.text.DecimalFormat;

public class Account {
	int ID;
	Customer customer;
	double balance = 0.0;
	
	public Account(int id, Customer customer, double balance) {
		this.ID = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, Customer customer) {
		this.ID = id;
		this.customer = customer;
	}
	
	public int getID() {
		return ID;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return customer.toString() + " balance=$" + df.format(balance);
	}
	
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	
	public Account deposit(double amount) {
		this.balance += amount;
		return this;
	}
	
	public Account withdraw(double amount) {
		if(balance >= amount) {
			this.balance -= amount;
		}
		else {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		
		return this;
	}
	
}

