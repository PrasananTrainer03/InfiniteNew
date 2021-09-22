package com.java.infinite.leave;

import java.sql.SQLException;
import java.util.Scanner;

public class LeaveHistoryMain {

	public static void main(String[] args) {
		LeaveDAO dao = new LeaveDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id   ");
		int empId=sc.nextInt();
		try {
			LeaveDetails[] history = dao.leaveHistory(empId);
			for (LeaveDetails leaveDetails : history) {
				System.out.println(leaveDetails);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
