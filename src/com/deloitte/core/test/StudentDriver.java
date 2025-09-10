package com.deloitte.core.test;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student(101,"Aritra");
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getCollege());
		Student s2=new Student(102,"Virat");
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getCollege());
		Student s3=new Student();
		s3.setId(103);
		s3.setName("Rohit");
		System.out.println(s3.getId()+" "+s3.getName()+" "+s3.getCollege());
	}
}
