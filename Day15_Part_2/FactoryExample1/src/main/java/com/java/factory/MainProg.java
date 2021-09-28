package com.java.factory;

import java.util.Scanner;

public class MainProg {
	
	public static void main(String[] args) {
		String vehicleType;
		System.out.println("Enter Vehicle Type  ");
		Scanner sc = new Scanner(System.in);
		vehicleType=sc.next();
		
		FactoryDemo demo = new FactoryDemo();
		Vehicle v = demo.show(vehicleType);
		v.name();
		v.price();
	}
}
