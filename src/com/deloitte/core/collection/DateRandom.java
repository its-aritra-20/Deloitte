package com.deloitte.core.collection;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DateRandom {
	public static void main(String[] args) {
		Date d=new Date();
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Hi.."+name+" your ticket number: "+r.nextInt(10000));
		System.out.println(d);
	}
}
