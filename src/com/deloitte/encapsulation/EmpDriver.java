package com.deloitte.encapsulation;

public class EmpDriver {
	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.setEid(10);
		e1.setName("Aritra");
		e1.setSalary(100);
		e1.show();
		e1.calSal(200);
			
	}
}
