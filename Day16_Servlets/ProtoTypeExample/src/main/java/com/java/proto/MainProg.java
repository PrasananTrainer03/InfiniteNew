package com.java.proto;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID  ");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name  ");
		String name = sc.next();
		System.out.println("Enter City  ");
		String city = sc.next();
		System.out.println("Enter Cgp  ");
		double cgp = sc.nextDouble();
		
		Student s1 = new Student(sid, name, cgp, city);
		s1.updateStudent();
		System.out.println(s1);
		
		ProtoType s2 = (ProtoType) s1.getPrototype();
		System.out.println(s2);
	}
}
