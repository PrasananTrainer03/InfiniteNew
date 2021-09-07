package com.java.infinite.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Rajesh extends Training {

	@Override
	void name() {
		System.out.println("Name is Rajesh...");
	}

	@Override
	void email() {
		System.out.println("Email is rajesh@gmail.com");
	}
	
}

class Prachi extends Training {

	@Override
	void name() {
		System.out.println("Name is Prachi...");
	}

	@Override
	void email() {
		System.out.println("Email is prachi@gmail.com");
	}
	
}

class Santosh extends Training {

	@Override
	void name() {
		System.out.println("Name is Santosh...");
	}

	@Override
	void email() {
		System.out.println("Email is santosh@gmail.com");
	}
	
}

public class AbsDemo {
	
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Rajesh(),
			new Santosh(),
			new Prachi()
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}

