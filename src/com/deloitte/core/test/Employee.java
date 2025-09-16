package com.deloitte.core.test;

public class Employee {
	private int id;
	private String name;
	private static String companyName="Deloitte";
	//No argument Constructor
	Employee(){
		
	}
	
	Employee(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	
}
