package com.java.infinite.leave;

import java.sql.SQLException;

public class LeaveShowMain {
	
	public static void main(String[] args) {
		
		LeaveDAO dao = new LeaveDAO();
		LeaveDetails[] leaveList;
		
		try {
			leaveList = dao.showLeave();
			for (LeaveDetails lev : leaveList) {
				System.out.println(lev);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
