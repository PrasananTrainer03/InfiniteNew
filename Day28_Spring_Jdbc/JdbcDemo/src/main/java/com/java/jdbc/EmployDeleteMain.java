package com.java.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployDeleteMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/java/jdbc/jdbc.xml");
		EmployDAO dao = (EmployDAO)ctx.getBean("emploDao");
		System.out.println(dao.deleteEmploy(empno));
	}
}
