package com.java.factory;

public class Bus extends Vehicle {

	@Override
	public void name() {
		System.out.println("Its Mahindra bus...");
	}

	@Override
	public void price() {
		System.out.println("Its 25laks...");
	}

	
}
