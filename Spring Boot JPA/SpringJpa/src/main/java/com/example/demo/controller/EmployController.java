package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	 @Autowired
	 private EmployService service;
	 
	 @RequestMapping("{empno}")
	  public Employ show(@PathVariable int empno) {
			return service.search(empno);
	}
	
	@GetMapping("/")
	public List<Employ> list() {
	    return service.showEmploy();
	}
}
