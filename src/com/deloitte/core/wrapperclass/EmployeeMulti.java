package com.deloitte.core.wrapperclass;

import java.util.Scanner;

public class EmployeeMulti {
	Integer eid;
	String ename;
	Float basic,hra,ta,da,gross;
	EmployeeMulti(Integer eid, String ename, Float basic){
		this.eid=eid;
		this.ename=ename;
		this.basic=basic;
	}
	void calculate() {
		hra=basic*12/100;
		System.out.println("HRA= "+hra);
		ta=basic*8/100;
		System.out.println("TA= "+ta);
		da=basic*10/100;
		System.out.println("DA= "+da);
		gross=basic+hra+ta+da;
		System.out.println("Gross= "+gross);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        EmployeeMulti[] employees = new EmployeeMulti[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee");

            System.out.print("Enter Employee ID: ");
            Integer eid = sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String ename = sc.next();

            System.out.print("Enter Basic Salary: ");
            Float basic = sc.nextFloat();

            employees[i] = new EmployeeMulti(eid, ename, basic);
        }

        
        for (EmployeeMulti emp : employees) {
            System.out.println("\nEmployee ID: " + emp.eid);
            System.out.println("Employee Name: " + emp.ename);
            emp.calculate();
        }

	}
	
	
}
