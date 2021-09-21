package com.java.inifinite.threads;

class Data {
	synchronized void showMsg(String name) {
		System.out.print("Hi  " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are you...");
	}
}

class Thejaswini implements Runnable {

	Data data;
	
	Thejaswini(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.showMsg("Thejaswini");
	}
	
}

class Shashank implements Runnable {

	Data data;
	
	Shashank(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.showMsg("Shashank");
	}
	
}
class Akash implements Runnable {
	
	Data data;
	
	Akash(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.showMsg("Akash");
	}
	
}
public class SyncEx {
	public static void main(String[] args) {
		Data d = new Data();
		Akash obj1 = new Akash(d);
		Shashank obj2 = new Shashank(d);
		Thejaswini obj3 = new Thejaswini(d);
		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
