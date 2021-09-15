package com.java.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployDelete {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Employ No  ");
		Scanner sc = new Scanner(System.in);
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinitepractice",
					"root","root");
			String cmd = "Delete from Employ where empno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			System.out.println("*** Record Deleted ***");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
