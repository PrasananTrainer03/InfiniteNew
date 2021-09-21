package com.java.inventory;

public class Stock {
	
	private String stockId;
	private String stockName;
	private int quantity;
	private double price;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	public Stock() {}
	public Stock(String stockId, String stockName, int quantity, double price) {
		this.stockId = stockId;
		this.stockName = stockName;
		this.quantity = quantity;
		this.price = price;
	}
	
	
}
