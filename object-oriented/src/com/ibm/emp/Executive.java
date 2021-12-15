package com.ibm.emp;

public class Executive extends Employee {
	private double commision;

	public Executive() {

	}

	public Executive(String name, double sal, double commision) {
		super(name, sal);
		this.commision = commision;
	}

	@Override
	public void Payslip() {
		super.Payslip();
		System.out.println("Commision:" + commision);
	}

	@Override
	public double getSal() {
		return super.getSal() + commision;
	}
}
