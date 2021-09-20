package com.java.infinite.lambda;

@FunctionalInterface
interface ICalc {
	int sum(int a,int b);
	int hashCode();
	String toString();
	boolean equals(Object ob);
}

public class Lambda3 {
	public static void main(String[] args) {
		ICalc c = (a,b) -> {
			return a+b;
		};
		
		System.out.println(c.sum(12, 5));
	}
}
