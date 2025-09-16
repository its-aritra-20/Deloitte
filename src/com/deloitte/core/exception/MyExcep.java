package com.deloitte.core.exception;

public class MyExcep extends Exception{
	public MyExcep(int age) {
		System.err.println("Sorry Age limit exceeds!"+age);
	}
}
