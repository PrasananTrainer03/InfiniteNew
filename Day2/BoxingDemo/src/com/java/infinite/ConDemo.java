package com.java.infinite;

public class ConDemo {

	int a,b;

	public ConDemo() {
		a=5;
		b=7;
	}

	public ConDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ConDemo [a=" + a + ", b=" + b + "]";
	}
	
	public static void main(String[] args) {
		ConDemo obj1 = new ConDemo();
		System.out.println(obj1);
		
		ConDemo obj2 = new ConDemo(88, 42);
		System.out.println(obj2);
	}
	
	
}
