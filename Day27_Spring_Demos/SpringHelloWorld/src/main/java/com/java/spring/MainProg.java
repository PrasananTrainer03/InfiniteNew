package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		String name="Shashank";
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spring/hello.xml");
		Hello hello = (Hello)ctx.getBean("bean1");
		System.out.println(hello.sayHello(name));
	}
}
