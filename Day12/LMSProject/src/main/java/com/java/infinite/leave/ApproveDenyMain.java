package com.java.infinite.leave;

import java.sql.SQLException;
import java.util.Scanner;

public class ApproveDenyMain {

	public static void main(String[] args) {
		int leaveId, empId;
		String status, managerComments;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter leaveId ");
		leaveId = sc.nextInt();
		System.out.println("Enter EmployId ");
		empId = sc.nextInt();
		System.out.println("Enter LeaveStatus (Yes/NO) ");
		status = sc.next();
		System.out.println("Enter ManagerComments ");
		managerComments=sc.next();
		LeaveDAO dao = new LeaveDAO();
		try {
			System.out.println(dao.approveDeny(empId, leaveId, status, managerComments));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
