package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/inter/{id}")
	public Object getEmploy(@PathVariable int id) {
		Object employs = restTemplate.getForObject("http://eureka-client-new/"+id, Object.class);
		return employs;
	}
	@GetMapping("/employs")
	public Object[] showEmploy() {
		Object[] employs = restTemplate.getForObject("http://eureka-client-new/", Object[].class);
		return employs;
	}
	
}
