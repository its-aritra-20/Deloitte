package com.deloitte.core.encapsulation;

public class Emp {
	int eid;
	String name;
	private int salary=10000;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void calSal(int cs) {
		double pf=salary*cs/100;
		salary=salary+100;
		show();
	}
	
	
	public void show() {
		System.out.println("Id: "+eid+" Name: "+name+" Salary: "+ salary);
	}
	
}
