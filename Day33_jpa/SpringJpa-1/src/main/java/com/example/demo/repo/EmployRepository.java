package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.Employ;

public interface EmployRepository extends JpaRepository<Employ, Integer> {
	List<Employ> searchByDept(String dept);
	// select * from employ where dept=? 
}
