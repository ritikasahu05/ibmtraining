package com.ibm.emp;

public class Manager extends Employee {
	private double Incentives;

	

	public Manager(String empname, double salary,double Incentives) {
		super(empname, salary);
		this.Incentives=Incentives;
	}

	@Override
	public void Payslip() {
		
		super.Payslip();
		System.out.println("Incentives:"+Incentives);
	}

	@Override
	public double getSal() {
		
		return super.getSal()+ Incentives;
	}
	
	
}