package com.java.infinite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/infinite/person.xml");
		
		Person personNeeraj = (Person)ctx.getBean("beanNeeraj");
		personNeeraj.showAll();
		
		Person personShashank = (Person)ctx.getBean("beanShashank");
		personShashank.showAll();
	}
}
