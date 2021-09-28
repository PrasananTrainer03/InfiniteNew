package com.java.factory;

public class FactoryDemo {

	public Vehicle show(String vehicleName) {
		if (vehicleName.toUpperCase().equals("BUS")) {
			return new Bus();
		} else 	if (vehicleName.toUpperCase().equals("CAR")) {
			return new Car();
		} else if (vehicleName.toUpperCase().equals("BIKE")) {
			return new Bike();
		}
		return null;
	}
}
