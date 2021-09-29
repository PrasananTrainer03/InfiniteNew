package com.java.infinite;

import java.sql.Connection;
import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		String dbName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Db Name  ");
		dbName = sc.next();
		ConnectionHelper helper = new ConnectionFactory().getInfo(dbName);
		Connection connection = helper.getConnection();
		System.out.println(dbName +" Connected Successfully...");
	}
}
