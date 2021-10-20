package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employ;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String helloWorldBean()  
	{  
		return "Welcome to Spring Boot Beans"; //constructor of HelloWorldBean  
	} 
	
	@RequestMapping("/empall") 
	public Employ[] showEmploy() {
		Employ[] arrEmp = new Employ[] {
			new Employ(1, "Joel", 88234),
			new Employ(3, "Neeraj",882355),
			new Employ(4, "Sundar",88123)
		};
		return arrEmp;
	}
	@RequestMapping("/sum/{a}/{b}")
	public String sum(@PathVariable int a, @PathVariable int b) {
		int c=a+b;
		String res="";
		res+=c;
		return res;
	}
	
	@RequestMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return "Good Morning " +name;
	}
	@RequestMapping("/shashank") 
	public String arya()
	{
		return "Hi I am Krishna Shashank....";
	}
}
