package com.java.infinite.leave;

import java.sql.SQLException;
import java.util.Scanner;

public class PendingLeavesMain {

	public static void main(String[] args) {
		int empId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Id   ");
		empId = sc.nextInt();
		LeaveDAO dao = new LeaveDAO();
		try {
			LeaveDetails[] pending = dao.pendingLeaves(empId);
			for (LeaveDetails leaveDetails : pending) {
				System.out.println(leaveDetails);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
