package com.java.infinite.good;

interface IHello {
	void show();
}

class Akash implements IHello {

	@Override
	public void show() {
		System.out.println("Hi I am Akash...");
	}
}

class Ibrahim implements IHello {

	@Override
	public void show() {
		System.out.println("Hi I am Ibrahim...");
	}
	
}

public class Demo {
	public static void main(String[] args) {
		IHello obj1 = new Akash();
		IHello obj2 = new Ibrahim();
		obj1.show();
		obj2.show();
	}
}
