package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WalletService {

	@Autowired
    private WalletRepository repo;
	
	public Wallet search(int walId) {
		return repo.findById(walId).get();
	}
}
