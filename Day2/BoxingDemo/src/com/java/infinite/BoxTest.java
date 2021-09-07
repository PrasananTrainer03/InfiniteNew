package com.java.infinite;

public class BoxTest {

	public void show(Object ob) {
	//	System.out.println(ob.getClass());
	//	System.out.println(ob.getClass().getName());
	//	System.out.println(ob.getClass().getSimpleName());
		String type=ob.getClass().getSimpleName();
		if (type.equals("Integer")) {
			System.out.println("Integer Casting...");
			int x = (Integer)ob;
			System.out.println(x);
		}
		if (type.equals("Double")) {
			System.out.println("Double Casting...");
			double x = (Double)ob;
			System.out.println(x);
		}
		if (type.equals("String")) {
			System.out.println("String Casting...");
			String x = (String)ob;
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Welcome";
		BoxTest obj = new BoxTest();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}
}
