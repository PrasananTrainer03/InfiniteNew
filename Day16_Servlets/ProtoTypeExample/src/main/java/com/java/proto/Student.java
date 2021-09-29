package com.java.proto;

public class Student implements ProtoType {

	private int sid;
	private String name;
	private double cgp;
	private String city;
	
	
	public Student() {
	}

	
	public void updateStudent() {
		name=name.toUpperCase();
		city=city.toUpperCase();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", cgp=" + cgp + ", city=" + city + "]";
	}


	public Student(int sid, String name, double cgp, String city) {
		this.sid = sid;
		this.name = name;
		this.cgp = cgp;
		this.city = city;
	}


	@Override
	public ProtoType getPrototype() {
		return new Student(sid, name, cgp, city);
	}

	
}
