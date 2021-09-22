package com.java.infinite.leave;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;


public class LeaveAddMain {
	
	public static void main(String[] args)  {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LeaveDetails leave = new LeaveDetails();
		
		System.out.println("Enter EmployID: ");
		leave.setEmpId(sc.nextInt());
//		System.out.println("Enter LeaveID: ");
//		leave.setEmpId(sc.nextInt());
		System.out.println("Enter no of Days: ");
		leave.setNoOfDays(sc.nextInt());
		
		System.out.println("Enter StartDate: ");
		leave.setLeaveStartDate(Date.valueOf(sc.next()));
		System.out.println("Enter Leave EndDate: ");
		leave.setLeaveEndDate(Date.valueOf(sc.next()));
		System.out.println("Enter Leave Type: ");
		String levtyp = sc.next();
		if(levtyp.toUpperCase().equals("EL")) {
			leave.setLeaveType(LeaveType.EL);
		}
		System.out.println("Enter Reason: ");
		leave.setLeaveReason(sc.next());
		
		
		LeaveDAO dao = new LeaveDAO();
		
		try {
			System.out.println(dao.applyLeave(leave));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
