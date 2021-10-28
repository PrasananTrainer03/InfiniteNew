package com.java.jsf;

import java.sql.SQLException;

public class MainProg {

	public static void main(String[] args) {
		try {
			System.out.println(new EmployDao().showEmploy().length);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
