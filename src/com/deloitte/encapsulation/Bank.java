package com.deloitte.encapsulation;

public class Bank extends Account{
	protected void trx() {
		System.out.println("Transaction successful");
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(accNo);
		System.out.println(b.accTYpe);
		b.trx();
		b.getIFSC();
	}
}
