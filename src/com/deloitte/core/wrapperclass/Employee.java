package com.deloitte.core.wrapperclass;

public class Employee {
	Integer eid;
	String ename;
	Float basic,hra,ta,da,gross;
	Employee(Integer eid, String ename, Float basic){
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
		Integer eid = Integer.parseInt(args[0]); 
        String ename = args[1];
        Float basic = Float.parseFloat(args[2]); 
        Employee emp = new Employee(eid, ename, basic);
        emp.calculate();

	}
	
	
}
