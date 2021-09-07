package com.java.infinite.sup;

class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

class Prithvi extends Employ {

	public Prithvi(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

class Mukesh extends Employ {

	public Mukesh(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

public class SupCon {

	public static void main(String[] args) {
		Employ emp1 = new Prithvi(1, "Prithvi", 88234);
		Employ emp2 = new Mukesh(3, "Mukesh", 90334);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
