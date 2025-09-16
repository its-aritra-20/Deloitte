package com.deloitte.core.exception;

public class InvalidNameException extends Exception {
	public InvalidNameException() {
		System.err.println("Sorry You are not elgible for loan , Please try later");
	}
}
