package com.java.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStock {
	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		Scanner sc = new Scanner(System.in);
		Stock stock = new Stock();
		System.out.println("Enter Stock Item Name  ");
		stock.setStockName(sc.next());
		System.out.println("Enter Price  ");
		stock.setPrice(sc.nextDouble());
		System.out.println("Enter Quantity  ");
		stock.setQuantity(sc.nextInt());
		try {
			System.out.println(dao.addStock(stock));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
