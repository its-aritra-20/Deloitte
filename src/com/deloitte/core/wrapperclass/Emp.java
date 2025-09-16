package com.deloitte.core.wrapperclass;

public class Emp {
	int eid;
	String eName;
	String loc;
	static String org="Deloitte";
	final int sal=1000; //can't be changed
	public Emp() {
		
	}
	public Emp(int eid, String eName, String loc) {
		this.eid = eid;
		this.eName = eName;
		this.loc = loc;
	}
	void show() {
		System.out.println("Eid :"+eid+" Name :"+eName+"Salary :"+sal+" Location: "+loc +" Organisation: "+org);
	}
	static void chg() {
		org="Deloitte USI";
	}
	public static void main(String[] args) {
		System.out.println("Transferred...");
		chg();
		Emp e1=new Emp(123,"sai","blr");
		Emp e2=new Emp(234,"joy","blr");
		Emp e3=new Emp(345,"gopi","blr");
		Emp e4=new Emp(456,"nil","blr");
		e1.show();
		e2.show();
		e3.show();
		e4.show();
	}
	static {
		System.out.println("Login success..");
	}
	
}
