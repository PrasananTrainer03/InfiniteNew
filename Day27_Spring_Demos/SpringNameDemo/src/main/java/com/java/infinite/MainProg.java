package com.java.infinite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/infinite/name.xml");
		Name objManish = (Name)ctx.getBean("beanManish");
		System.out.println(objManish.fullName());
		
		Name objChandana = (Name)ctx.getBean("beanChandana");
		System.out.println(objChandana.fullName());
		
		Name objJoel = (Name)ctx.getBean("beanJoel");
		System.out.println(objJoel.fullName());
	}
}
