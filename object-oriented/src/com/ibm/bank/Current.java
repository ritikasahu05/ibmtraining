package com.ibm.bank;

public class Current extends Accounts {
	private double overdraft;
	
	public Current() {
		
	}
	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		this.overdraft=OVERDRAFT_LIMIT;
	}
	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+ overdraft);
	}
	@Override
	public void deposit(double amount) {
			overdraft+= amount;
			if(overdraft > 10000)
				balance+= overdraft -10000; 
			    overdraft = 10000;
	}
	@Override
	public void withdraw(double amount) {
		if(amount<=(balance+overdraft)) {
			balance-= amount;
		    if(balance<0)
		    	overdraft+=balance;
		        balance = 0;
		}
		else
		    System.out.println("Insufficient Balance");
		   
	}
	
}
