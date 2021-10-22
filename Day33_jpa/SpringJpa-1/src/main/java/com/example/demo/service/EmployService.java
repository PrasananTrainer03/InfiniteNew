package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Employ;
import com.example.demo.repo.EmployRepository;

@Service
@Transactional
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	public void update(Employ employ) {
		repo.save(employ);
	}
	public void save(Employ employ) {
		repo.save(employ);
	}
	public Employ get(int id) {
		return repo.findById(id).get();
	}
	
	public List<Employ> searchByDept(String dept) {
		return repo.searchByDept(dept);
	}
	public List<Employ> listAll() {
		return repo.findAll();
	}
}
