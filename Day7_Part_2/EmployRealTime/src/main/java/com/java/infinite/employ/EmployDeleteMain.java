package com.java.infinite.employ;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Employ Number   ");
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAO();
		try {
			System.out.println(dao.deleteEmploy(empno));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
