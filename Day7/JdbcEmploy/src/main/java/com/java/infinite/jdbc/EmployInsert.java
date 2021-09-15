package com.java.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno,basic;
		String dept,desig,name;
		Gender gender=Gender.MALE;
		System.out.println("Enter Employ No  ");
		empno=sc.nextInt();
		System.out.println("Enter Name  ");
		name=sc.next();
		System.out.println("Enter Gender ");
		String gen = sc.next();
		if (gen.toUpperCase().equals("MALE")) {
			gender = Gender.MALE;
		}
		if (gen.toUpperCase().equals("FEMALE")) {
			gender=Gender.FEMALE;
		}
		System.out.println("Enter Department  ");
		dept = sc.next();
		System.out.println("Enter Designation  ");
		desig = sc.next();
		System.out.println("Enter Basic   ");
		basic = sc.nextInt();
		String cmd = "insert into Employ(empno,name,gender,dept,"
				+ "desig,basic) values(?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitepractice",
					"root","root");
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setString(3, gender.toString());
			pst.setString(4, dept);
			pst.setString(5, desig);
			pst.setInt(6, basic);
			pst.executeUpdate();
			System.out.println("*** Record Inserted ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
