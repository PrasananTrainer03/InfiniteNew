package com.java.inifinite.threads;

class Tab3 implements Runnable {

	Demo demo;
	
	Tab3(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.showTable(21);
	}
	
}

class Tab2 implements Runnable {

	Demo demo;
	
	Tab2(Demo demo) {
		this.demo = demo;
	}
	
	@Override
	public void run() {
		demo.showTable(19);
	}
	
}

class Tab1 implements Runnable {
	Demo demo;
	Tab1(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.showTable(12);
	}
}

class Demo {
	synchronized void showTable(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n + " * " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MTable {
	public static void main(String[] args) {
		Demo obj = new Demo();
		Tab1 tab1 = new Tab1(obj);
		Tab2 tab2 = new Tab2(obj);
		Tab3 tab3 = new Tab3(obj);
		
		Thread t1 = new Thread(tab1);
		Thread t2 = new Thread(tab2);
		Thread t3 = new Thread(tab3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
