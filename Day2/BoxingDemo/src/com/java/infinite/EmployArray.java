package com.java.infinite;

public class EmployArray {

	public static void main(String[] args) {
		Employ emp1 = new Employ();
		emp1.empno=1;
		emp1.name="Hari Chandana";
		emp1.basic=88234;
		
		Employ emp2 = new Employ();
		emp2.empno=3;
		emp2.name="Joel";
		emp2.basic=88235;
		
		Employ emp3 = new Employ();
		emp3.empno=4;
		emp3.name="Manish";
		emp3.basic=88903;
//		System.out.println(emp1);
		
		Employ[] arrEmploy = new Employ[] {
			emp1, emp2, emp3	
		};
		
		for (Employ emp : arrEmploy) {
			System.out.println(emp);
		}
	}
}
