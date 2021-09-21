package com.java.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class PlaceOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Id  ");
		String stockId = sc.next();
		System.out.println("Enter Quantity to Order  ");
		int qty = sc.nextInt();
		StockDAO dao = new StockDAO();
		try {
			System.out.println(dao.placeOrder(stockId, qty));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
