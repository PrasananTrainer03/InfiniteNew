package com.java.infinite;

public class EvenOdd {

	public void check(int n) {
		if (n%2==0) {
			System.out.println("Even Number...");
		} else {
			System.out.println("Odd Number...");
		}
	}
	public static void main(String[] args) {
		int n=5;
		EvenOdd obj = new EvenOdd();
		obj.check(n);
	}
}
