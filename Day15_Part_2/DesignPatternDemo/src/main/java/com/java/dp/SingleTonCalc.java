package com.java.dp;

public class SingleTonCalc {

	public static void main(String[] args) {
		//Calculation obj = new Calculation();
		Calculation c1 = Calculation.getInstance();
		System.out.println(c1.sum(12, 5));
		System.out.println(c1.sub(12, 5));
		System.out.println(c1.mult(12, 5));
		
		Calculation c2 = Calculation.getInstance();
		System.out.println(c2.sum(12, 5));
		System.out.println(c2.sub(12, 5));
		System.out.println(c2.mult(12, 5));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
