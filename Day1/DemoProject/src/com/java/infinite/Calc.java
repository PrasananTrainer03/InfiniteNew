package com.java.infinite;

public class Calc {

	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("Sum is  " +c);
	}
	public static void main(String[] args) {
		int a,b;
		a=5;
		b=7;
		Calc obj = new Calc();
		obj.sum(a, b);
	}
}
