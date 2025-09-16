package com.deloitte.core.exception;

public class BankDriver {
	public static void main(String[] args) {
		Bank b=new Bank();
		Account a1=new Account("Aritra","100");
		Account a2=new Account("Chakraborty","200");
		Account a3=new Account("Arun","300");
		b.addAccount(a1);
		b.addAccount(a2);
		b.addAccount(a3);
		try {
			b.loanEligibility("201");
		}catch (InvalidNameException e){
			e.printStackTrace();
		}finally {
			System.out.println("Finally!!!");
		}
		
	}
}
