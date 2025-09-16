package com.deloitte.core.string;

import java.util.StringTokenizer;

public class C {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Welcome to training session");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(" "));
		}
	} 
}
