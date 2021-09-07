package com.java.infinite;

public class StExample {

	static int score;
	
	public void incr() {
		score++;
	}
	
	public void show() {
		System.out.println("Score is  " +score);
	}
	public static void main(String[] args) {
		StExample obj1 = new StExample();
		StExample obj2 = new StExample();
		StExample obj3 = new StExample();
		
		obj1.incr();
		obj2.incr();
		obj3.incr();
		
		obj1.show();
	}
}
