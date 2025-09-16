package com.core.deloitte.comparable;

public class Emp implements Comparable<Emp>{
	String name;
	String eid;
	int salary;
	public Emp(String eid, String name, int salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	public int compareTo(Emp e) {
		if(salary==e.salary) {
			return 0;
		}else if(salary<e.salary) {
			return 1;
		}else {
			return -1;
		}
	}
	
		
	
	
}
