package com.java.infinite.intf;

interface ITraining {

	void name();
	void email();
}

class Rajesh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Rajesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is rajesh@gmail.com");
	}
}

class Santosh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Santosh...");
	}

	@Override
	public void email() {
		System.out.println("Email is santosh@gmail.com");
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		ITraining[] arrTraining = new ITraining[] {
			new Rajesh(),
			new Santosh()
		};
		for (ITraining t : arrTraining) {
			t.name();
			t.email();
		}
	}
}
