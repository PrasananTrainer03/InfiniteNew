package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	private int venId;
	private String venName;
	private String venNumber;
	private String venUserName;
	public String getVenNumber() {
		return venNumber;
	}
	public void setVenNumber(String venNumber) {
		this.venNumber = venNumber;
	}
	public String getVenUserName() {
		return venUserName;
	}
	public void setVenUserName(String venUserName) {
		this.venUserName = venUserName;
	}
	public String getVenAddress() {
		return venAddress;
	}
	public void setVenAddress(String venAddress) {
		this.venAddress = venAddress;
	}
	private String venPassword;
	private String venEmail;
	private String venAddress;
	
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public String getVenPassword() {
		return venPassword;
	}
	public void setVenPassword(String venPassword) {
		this.venPassword = venPassword;
	}
	public String getVenEmail() {
		return venEmail;
	}
	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}
	
	
}
