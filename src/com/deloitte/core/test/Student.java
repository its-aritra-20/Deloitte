package com.deloitte.core.test;

public class Student {
	private int id;
	private String name;
	private static String college="UEMK";
	Student(){
		
	}
	Student(int id , String name){
		//super();
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
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	
}
