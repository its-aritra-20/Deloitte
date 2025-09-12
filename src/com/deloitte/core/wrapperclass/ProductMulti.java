package com.deloitte.core.wrapperclass;

import java.util.Scanner;

public class ProductMulti {
	Integer pid;
	String pname;
	Float up;
	Integer stk;
	Float tc;
	Integer rem;
	Integer qty;

	public ProductMulti(Integer pid, String pname, Float up, Integer stk) {
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
		System.out.println("Enter the number of Products: ");
		int n = sc.nextInt();
		ProductMulti[] p = new ProductMulti[n];
		System.out.println("Enter Product details");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Product ID: ");
			Integer pid = sc.nextInt();

			System.out.print("Enter Product Name: ");
			String pname = sc.next();

			System.out.print("Enter Unit Price: ");
			Float up = sc.nextFloat();

			System.out.print("Enter Stock Quantity: ");
			Integer stk = sc.nextInt();
			p[i] = new ProductMulti(pid, pname, up, stk);
		}
		int flag = 1;
		while (flag==1) {
			System.out.println("Enter product id  (0 to exit)");
			Integer id = sc.nextInt();
			if (id == 0) {
                System.out.println("Exiting purchase system");
                break;
            }

			boolean found = false;
			for (ProductMulti prod : p) {
				if (prod.pid.equals(id)) {
					System.out.println("Product: " + prod.pname);
					System.out.println("Enter Number of qty to buy");
					prod.calculate(sc.nextInt());
					found = true;
					
					break;
				}
			}
			if (found == false) {
				System.out.println("Invalid pid");
			}

		}

	}
}
