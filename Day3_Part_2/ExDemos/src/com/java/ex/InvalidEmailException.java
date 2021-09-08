package com.java.ex;

public class InvalidEmailException extends Exception {

	InvalidEmailException(String error) {
		super(error);
	}
	
	InvalidEmailException() {

	}
}
