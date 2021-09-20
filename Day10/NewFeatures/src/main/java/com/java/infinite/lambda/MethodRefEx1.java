package com.java.infinite.lambda;

@FunctionalInterface
interface ITest {
	void sayHello();
}

public class MethodRefEx1 {

	public void greeting() {
		System.out.println("Welcome to Method References.. ");
	}
	
	public static void main(String[] args) {
		MethodRefEx1 obj = new MethodRefEx1();
		ITest t = obj::greeting;
		t.sayHello();
	}
}
