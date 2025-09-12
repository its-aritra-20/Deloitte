package com.deloitte.core.string;

public class A {
	public static void main(String[] args) {
		String s="Deloitte";
		String s1="Deloitte";
		String s2="Welcome";
		String obj=new String(s1);
		String obj1=new String(s2);
		System.out.println(s.contains("Deloitte"));
		System.out.println(s.endsWith("k"));
		System.out.println(s.substring(1,4));
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(s.contains("Deloitte"));
		s1=s1.concat(s);
		System.out.println(s1==s2);
		System.out.println(s.compareTo(s1));
	}
}
