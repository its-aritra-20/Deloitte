package com.deloitte.encapsulation;

abstract class Employee {
	int eid;
	final static String loc="Kolkata";
	protected float sal=10000;
	static final int pf=1800;
	int loanAmt=1000;
	abstract protected void grossSalary();
	void show() {
		System.out.println("Eid: "+eid+" Loc: "+loc+" pf :"+pf+ " Loan Amount: "+loanAmt);
		grossSalary();
	}
	
	
	
	
}
