package com.deloitte.core.exception;

public class Account {
	private String name;
	private String accountNo;
	public Account(String name, String accountNo) {
		super();
		this.name = name;
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
}
