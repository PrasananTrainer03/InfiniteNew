package com.java.infinite.p2;

public class ArrayEx2 {

	public void show() {
		String[] names = new String[] {
				"Santosh",
				"Tanveer",
				"Aishwarya",
				"Apoorvaditya",
				"Praneetha"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ArrayEx2 obj = new ArrayEx2();
		obj.show();
	}
}
