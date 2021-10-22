package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Employ;
import com.example.demo.service.EmployService;

@RestController
public class EmployController {

	@Autowired
	private EmployService service;
	
	@RequestMapping(value="/")
	public List<Employ> list() {
		return service.listAll();
	}
	
	@DeleteMapping("/employs/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
	
	@PutMapping("/employUpdate")
	public void updat(@RequestBody Employ employ) {
		service.update(employ);
	}
	
	@PostMapping("/employs")
	public void add(@RequestBody Employ employ) {
		service.save(employ);
	}
	
	@RequestMapping("/dept/{dname}")
	public List<Employ> listByDept(@PathVariable String dname) {
		return service.searchByDept(dname);
	}
	
	@RequestMapping("/employ/{id}")
	public ResponseEntity<Employ> get(@PathVariable int id) {
		try {
		Employ employ = service.get(id);
		return new ResponseEntity<Employ>(employ,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Employ>(HttpStatus.NOT_FOUND);
		}
	}
}
