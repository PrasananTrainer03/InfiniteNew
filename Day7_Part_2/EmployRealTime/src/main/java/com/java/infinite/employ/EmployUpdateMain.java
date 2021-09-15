package com.java.infinite.employ;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdateMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender ");
		String gen = sc.next();
		if (gen.toUpperCase().equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.toUpperCase().equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextInt());
		EmployDAO dao = new EmployDAO();
		try {
			System.out.println(dao.updateEmploy(employ));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
