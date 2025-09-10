package com.deloitte.encapsulation;

public class EmployeeDriver extends Employee{
	protected void grossSalary() {
		System.out.println("Gross Salary="+(sal+pf-loanAmt));
	}
	public static void main(String[] args) {
		EmployeeDriver e1=new EmployeeDriver();
		e1.show();
	}
}
