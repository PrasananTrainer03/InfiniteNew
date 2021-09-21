package com.java.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {

	Connection connection;
	PreparedStatement pst;
	
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
