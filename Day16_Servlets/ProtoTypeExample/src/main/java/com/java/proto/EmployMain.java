package com.java.proto;

import java.util.Scanner;

public class EmployMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id  ");
		int empId=sc.nextInt();
		System.out.println("Enter Employ Name  ");
		String name = sc.next();
		System.out.println("Enter Basic  ");
		double basic = sc.nextDouble();
		
		Employ accounts = new Employ(empId,name,basic);
		accounts.allowances();
		accounts.deductions();
		accounts.takeHome();
		
		System.out.println(accounts);
		
		ProtoType p = (ProtoType)accounts.getPrototype();
		System.out.println(p);
	}
}
