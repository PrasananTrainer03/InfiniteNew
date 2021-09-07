package com.java.infinite;

public class ConEmp {

	public static void main(String[] args) {
//		Emp emp = new Emp(1, "Sreenath", 88256);
//		System.out.println(emp);
//		
		Emp[] arrEmp = new Emp[] {
			new Emp(1, "Raghuvir", 882566),
			new Emp(2, "Santosh", 88904),
			new Emp(3, "Prithvi",80994),
			new Emp(4, "Prachi",99833)
		};
		
		for (Emp emp : arrEmp) {
			System.out.println(emp);
		}
	}
}
