package com.java.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowAllMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/jdbc/jdbc.xml");
		EmployDAO dao = (EmployDAO)ctx.getBean("emploDao");
		Employ[] arrEmploy = dao.showEmploy();
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
