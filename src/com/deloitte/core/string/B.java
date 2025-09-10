package com.deloitte.core.string;

public class B {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Deloitte");
		//sb.reverse();
		sb.append("Training");
		sb.insert(8," Provides ");
		sb.replace(9,13, "Webservices");
		sb.delete(9, 12);
		
		System.out.println(sb);
		
	}
}
