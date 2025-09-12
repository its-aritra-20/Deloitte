package com.deloitte.core.wrapperclass;

import java.util.Scanner;

public class Product {
	Integer pid;
	String pname;
	Float up;
	Integer stk;
	Float tc;
	Integer rem;
	Integer qty;

	public Product(Integer pid, String pname, Float up, Integer stk) {
		this.pid = pid;
		this.pname = pname;
		this.up = up;
		this.stk = stk;

	}

	void calculate(Integer qty) {
		tc = qty * up;
		System.out.println("Total Cost: " + tc);
		stk -= qty;
		System.out.println("Remaining Quantity :" + stk);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product ID: ");
		Integer pid = sc.nextInt();

		System.out.print("Enter Product Name: ");
		String pname = sc.next();

		System.out.print("Enter Unit Price: ");
		Float up = sc.nextFloat();

		System.out.print("Enter Stock Quantity: ");
		Integer stk = sc.nextInt();

		Product goods = new Product(pid, pname, up, stk);
		System.out.println("Enter Number of qty to buy");
		goods.calculate(sc.nextInt());
	}
}
