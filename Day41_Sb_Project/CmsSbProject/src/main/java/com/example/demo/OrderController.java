package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	

//	@RequestMapping(value="/customerOrders/{cid}")
//	public List<Orders> customerOrders(@PathVariable int cid) {
//		return service.showCustomerOrders(cid);
//	}
//	
//	@RequestMapping(value="/vendorOrders/{vid}")
//	public List<Orders> vendorOrders(@PathVariable int vid) {
//		return service.showVendorOrders(vid);
//	}
	
	@RequestMapping(value="/showorders")
	public List<Orders> list() {
		return service.showOrders();
	}
	
	@RequestMapping("/order/{id}")
	public ResponseEntity<Orders> get(@PathVariable int id) {
		try {
		Orders orders = service.search(id);
		return new ResponseEntity<Orders>(orders,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Orders>(HttpStatus.NOT_FOUND);
		}
	}
}
