package com.java.infinite;

public class ConnectionFactory {

	public ConnectionHelper getInfo(String database) {
		if (database.equalsIgnoreCase("MYSQL")) {
			return new MySqlConnectionHelper();
		} else if (database.equalsIgnoreCase("ORACLE")) {
			return new OracleConnectionHelper();
		}
		return null;
	}
}
