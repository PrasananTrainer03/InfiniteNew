package com.java.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String placeOrder(String stockId, int qtyOrd) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		Stock stock = searchStock(stockId);
		if (stock!=null) {
			int qtyAvail = stock.getQuantity();
			if (qtyAvail -qtyOrd > 0) {
				String cmd = "Insert into Orders(StockId,StockName,QtyOrd,Price) "
						+ " values(?,?,?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setString(1, stockId);
				pst.setString(2, stock.getStockName());
				pst.setInt(3, qtyOrd);
				pst.setDouble(4, stock.getPrice());
				pst.executeUpdate();
				cmd = "update stock set Quantity=Quantity-? where stockId=?";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, qtyOrd);
				pst.setString(2, stockId);
				pst.executeUpdate();
				double billAmount = qtyOrd * stock.getPrice();
				cmd = "update Amount set Gamt=Gamt+?";
				pst = connection.prepareStatement(cmd);
				pst.setDouble(1, billAmount);
				pst.executeUpdate();
				return "Order Placed Successfully...";
			}
			else {
				return "Insufficient Quantity...";
			}
		}
		return "Invalid StockId...";
	}
	public Stock searchStock(String stockId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock where StockId=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if (rs.next()) {
			stock = new Stock();
			stock.setStockId(rs.getString("StockId"));
			stock.setStockName(rs.getString("StockName"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQuantity(rs.getInt("quantity"));
		}
		return stock;
	}
	public String addStock(Stock stock) throws ClassNotFoundException, SQLException {
		String sid = generateStockId();
		stock.setStockId(sid);
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Stock(StockId,StockName,Quantity,Price) values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, sid);
		pst.setString(2, stock.getStockName());
		pst.setInt(3, stock.getQuantity());
		pst.setDouble(4, stock.getPrice());
		pst.executeUpdate();
		return "Stock Placed Successfully...";
	}
	
	public String generateStockId() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(StockID) is NULL THEN 'S000' else max(StockID) END sid from Stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String sid = rs.getString("sid");
		int id =Integer.parseInt(sid.substring(1));
		id++;
		if (id >=1 && id <=9) {
			sid = "S00"+id;
		}
		if (id >=10 && id <=99) {
			sid="S0" +id;
		}
		if (id >=100 && id <= 999) {
			sid="S"+id;
		}
		return sid;
	}
}
