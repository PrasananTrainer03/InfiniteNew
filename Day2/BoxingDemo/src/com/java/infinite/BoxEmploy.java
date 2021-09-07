package com.java.infinite;

public class BoxEmploy {

	public void show(Object ob) {
		Employ employ = (Employ)ob;
		System.out.println("Employ No  " +employ.empno);
		System.out.println("Employ Name  " +employ.name);
		System.out.println("Salary  " +employ.basic);
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno=1;
		employ.name="Krishna";
		employ.basic=88224;
		
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
	}
}
