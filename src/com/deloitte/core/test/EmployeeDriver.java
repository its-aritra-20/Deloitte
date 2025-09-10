package com.deloitte.core.test;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Aritra");
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCompanyName());
		Employee e2=new Employee(102,"Virat");
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getCompanyName());
		Employee e3=new Employee();
		e3.setId(103);
		e3.setName("Rohit");
		System.out.println(e3.getId()+" "+e3.getName()+" "+e3.getCompanyName());
	}
}
