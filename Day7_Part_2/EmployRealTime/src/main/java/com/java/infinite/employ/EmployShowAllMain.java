package com.java.infinite.employ;

import java.sql.SQLException;

public class EmployShowAllMain {
	public static void main(String[] args) {
		EmployDAO dao = new EmployDAO();
		Employ[] employList;
		try {
			employList = dao.showEmploy();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
