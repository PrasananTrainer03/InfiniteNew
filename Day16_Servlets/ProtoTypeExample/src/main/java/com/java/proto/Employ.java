package com.java.proto;

public class Employ implements ProtoType {

	private int empno;
	private String name;
	private double salary;
	
	private double hra;
	private double da;
	private double tax;
	private double gross;
	private double net;
	
	public Employ() {}
	
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", salary=" + salary + ", hra=" + hra + ", da=" + da
				+ ", tax=" + tax + ", gross=" + gross + ", net=" + net + "]";
	}


	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name=name;
		this.salary=basic;
	}
	
	public void allowances() {
		this.hra = this.salary*0.05;
		this.da=this.salary*0.01;
	}
	
	public void deductions() {
		this.tax = this.salary*0.03;
	}
	
	public void takeHome() {
		this.gross = this.hra+this.da;
		this.net = this.gross-this.tax;
	}

	@Override
	public ProtoType getPrototype() {
		// TODO Auto-generated method stub
		return new Employ(empno,name,salary);
	}
	
	
}
