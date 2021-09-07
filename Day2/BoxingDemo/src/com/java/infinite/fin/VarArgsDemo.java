package com.java.infinite.fin;

public class VarArgsDemo {

	public void show(String...names) {
		for (String s : names) {
			System.out.print(s + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgsDemo obj = new VarArgsDemo();
		obj.show();
		obj.show("Rajesh");
		obj.show("Sanotsh","Prithvi");
		obj.show("Prachi","Pranitha","Anushka");
		
	}
}
