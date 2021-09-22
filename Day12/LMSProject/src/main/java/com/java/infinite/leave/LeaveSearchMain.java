package com.java.infinite.leave;

import java.sql.SQLException;
import java.util.Scanner;

public class LeaveSearchMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int leaveId;
		System.out.println("Enter LeaveID  ");
		leaveId = sc.nextInt();
		LeaveDAO dao = new LeaveDAO();
		
		try {
			LeaveDetails leave = dao.searchLeave(leaveId);
			if(leave!=null) {
				System.out.println(leave);
			} else {
				System.out.println("***Record Not Found***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
