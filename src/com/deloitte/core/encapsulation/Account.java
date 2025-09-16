package com.deloitte.core.encapsulation;

abstract class Account {
	 final static long accNo=10002490;
	 String accTYpe="Savings";
	 public Account() {
		 System.out.println("Account created");
	 }
	 abstract protected void trx();
	 public void getIFSC() {
		 System.out.println("HDFC10009");
	 }
	 
}
