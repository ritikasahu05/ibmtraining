package com.ibm.bank;

/**
 * This class represents generalized bank account.
 * @author Ritika Sahu
 * @version 1.0*/
public abstract class Accounts implements Bank{
	private int acntNo;
	private String holder;
	protected double balance;
    
	

	private static int counter;

	// Executes at the time of class loading..
	static { // Static initializer block, consider as constructor for static members
		System.out.println("Account class loaded...");
		counter = INIT_ACCOUNT_NO;
	}

	/**Default Constructor*/
	public Accounts() {
	}
	
	/**
	 * Parameterized constructor for creating account
	 * @param holder
	 * @param balance
	 */

	public Accounts(String holder, double balance) {
		this.acntNo = counter++;
		this.holder = holder;
		this.balance = balance;
	}
     /**
      * Method to print account summary.
      */
	public void summary() {
		System.out.println("A/C no:" + acntNo);
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount);
}
