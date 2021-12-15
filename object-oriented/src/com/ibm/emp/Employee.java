package com.ibm.emp;

public abstract class Employee {

	private String name;
	private int no;
	private double sal;
	private static int counter;

	static {
		counter = 3003;
	}

	public Employee() {
	}

	public Employee(String name, double sal) {
		this.name = name;
		this.no = counter++;
		this.sal = sal;
	}
	
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void Payslip() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID no.: " + no);
		System.out.println("Salary: " + sal);
	}

}
