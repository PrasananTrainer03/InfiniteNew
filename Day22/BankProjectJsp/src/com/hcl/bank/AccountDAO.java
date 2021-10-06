package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {

	PreparedStatement pst;
	Connection con;
	
	public String withdrawAccountDao(int accountNo,
			int withdrawAmount) {
		con=DaoConnection.getConnection();
		String result="";
		Accounts objAccounts=searchAccountDao(accountNo);
		if(objAccounts!=null) {
			int amount=objAccounts.getAmount();
			String status=objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) { 
				result="Account Closed...";
			} else {
			if(amount-withdrawAmount >= 1000) {
				String cmd="update Accounts set amount=amount-? "
						+ " Where AccountNo=?";
				try {
					pst=con.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd="Insert into Trans(AccountNo,TransAmount,"
							+ "TransType) values(?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setInt(2, withdrawAmount);
					pst.setString(3, "D");
					pst.executeUpdate();
					result="Amount Debited...";
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				result="Insufficient Funds...";
			} 
			}
		} else {
			result="Account No not Found...";
		}
		return result;
	}
	
	public String depositAccountDao(int accountNo,int depAmount) {
		con=DaoConnection.getConnection();
		String result="";
		String cmd="update Accounts set amount=amount+? "
				+ " Where AccountNo=?";
		Accounts objAccounts=searchAccountDao(accountNo);
		if(objAccounts==null) {
			result="Account No not Found...";
		} else {
			String status=objAccounts.getStatus();
			if(status.equalsIgnoreCase("inactive")) {
				result="Account Closed...";
			} else {
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, depAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd="Insert into Trans(AccountNo,TransAmount,"
					+ "TransType) values(?,?,?)";
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, depAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			result="Amount Credited...";
		} catch (SQLException e) {
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		}
		return result;
	}
	public String closeAccountDao(int accountNo) {
		con=DaoConnection.getConnection();
		String result=""; 
		Accounts objAccount=searchAccountDao(accountNo);
		if(objAccount==null) {
			result="Account No not Found...";
		} else {
		String cmd="update Accounts set status='inactive' "
				+ " Where AccountNo=?";
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result="Account Closed...";
		} catch (SQLException e) {
			e.printStackTrace();
			result=e.getMessage();
		}
		}
		return result;
	}
	
	public String updateAccountDao(int accountNo,
					String city,String state) {
		con=DaoConnection.getConnection();
		Accounts objAccounts=searchAccountDao(accountNo);
		String cmd="Update Accounts set City=?, State=? "
				+ " Where AccountNo=?";
		String result="";
		if(objAccounts==null) {
			result="Account No not Found...";
		} else {
			String status=objAccounts.getStatus();
			if(status.equals("inactive")) {
				result="Account Closed Already...";
			} else {
				
			
			try {
				pst=con.prepareStatement(cmd);
				pst.setString(1, city);
				pst.setString(2, state);
				pst.setInt(3, accountNo);
				pst.executeUpdate();
				result="Account Updated...";
			} catch (SQLException e) {
				e.printStackTrace();
				result=e.getMessage();
			}
		}
		}
		return result;
	}
	
	public Accounts searchAccountDao(int accountNo) {
		con=DaoConnection.getConnection();
		String cmd="select * from Accounts where accountNo=?";
		Accounts objAccounts=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
			  objAccounts=new Accounts();
			  objAccounts.setFirstName(rs.getString("firstName"));
			  objAccounts.setLastName(rs.getString("lastName"));
			  objAccounts.setCity(rs.getString("city"));
			  objAccounts.setState(rs.getString("State"));
			  objAccounts.setAmount(rs.getInt("Amount"));
			  objAccounts.setCheqFacil(rs.getString("CheqFacil"));
		objAccounts.setAccountType(rs.getString("AccountType"));
		objAccounts.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objAccounts;
	}
	
	public String createAccountDao(Accounts objAccounts) {
		con=DaoConnection.getConnection();
		String cmd="Insert into Accounts(AccountNo,FirstName,"
				+ "LastName,City,State,Amount,CheqFacil,"
				+ "AccountType) values(?,?,?,?,?,?,?,?)";
		String result="";
		try {
			pst=con.prepareStatement(cmd);
			pst.setInt(1, objAccounts.getAccountNo());
			pst.setString(2, objAccounts.getFirstName());
			pst.setString(3, objAccounts.getLastName());
			pst.setString(4, objAccounts.getCity());
			pst.setString(5, objAccounts.getState());
			pst.setInt(6, objAccounts.getAmount());
			pst.setString(7, objAccounts.getCheqFacil());
			pst.setString(8, objAccounts.getAccountType());
			pst.executeUpdate();
			result="Account Created Successfully...";
		} catch (SQLException e) {
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
	}
	
	public int generateAccountNoDao() {
		con=DaoConnection.getConnection();
		int accno=0;
		String cmd="select case when max(accountNo) IS NULL "
				+ " THEN 1 else MAX(AccountNo)+1 END accno "
				+ " From Accounts";
		try {
			pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accno;
	}
}
