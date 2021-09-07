package com.java.demo;

public class ArrEx {

	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10]=55;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is small...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
