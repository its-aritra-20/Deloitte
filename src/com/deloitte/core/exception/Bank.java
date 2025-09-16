package com.deloitte.core.exception;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<String,String> bank;
	Bank(){
		bank=new HashMap<>();
	}
	public void addAccount(Account a) {
		if(bank.containsKey(a.getName())) {
			System.out.println("Account Name exists!!");
			return;
		}
		if(bank.containsValue(a.getAccountNo())) {
			System.out.println("Account No. exists!!");
			return;
		}
		bank.put(a.getName(), a.getAccountNo());
	}
	public void loanEligibility(String accountNo) throws InvalidNameException {
		for(Map.Entry<String, String> m:bank.entrySet()) {
			if(m.getValue().equals(accountNo)) {
				System.out.println("Hi "+m.getKey()+" , your Account No. "+m.getValue()+" , you are eligible for loan!!");
				return;
			}
		}
		throw new InvalidNameException();
	}
}
