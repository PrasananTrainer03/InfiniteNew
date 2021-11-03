package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	private int menuId;
	private String menuItem;
	private double menuPrice;
	private double menuCalories;
	private String menuType;
	private String menuStatus;
	private String menuRating;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
	public double getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}
	public double getMenuCalories() {
		return menuCalories;
	}
	public void setMenuCalories(double menuCalories) {
		this.menuCalories = menuCalories;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	
	public String getMenuStatus() {
		return menuStatus;
	}
	public void setMenuStatus(String menuStatus) {
		this.menuStatus = menuStatus;
	}
	public String getMenuRating() {
		return menuRating;
	}
	public void setMenuRating(String menuRating) {
		this.menuRating = menuRating;
	}
	
	
}
