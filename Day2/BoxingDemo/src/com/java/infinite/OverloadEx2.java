package com.java.infinite;

public class OverloadEx2 {

	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x+5;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		OverloadEx2 obj = new OverloadEx2();
		System.out.println(obj.sum());
		System.out.println(obj.sum(12));
		System.out.println(obj.sum(56, 24));
	}
}
