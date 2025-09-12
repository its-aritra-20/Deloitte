package com.deloitte.core.wrapperclass;

public class Student {
	
    String sname;
    Integer sid,m1, m2, m3;
    public Student(Integer sid, String sname, Integer m1, Integer m2, Integer m3) {
        this.sid = sid;
        this.sname = sname;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

	public void calculate() {
		Integer tot=m1+m2+m3;
		System.out.println(tot);
		
		Integer avg=tot/3;
		System.out.println(avg);
		if(avg>=60 &&m1>35 &&m2>35 &&m3>35) {
			System.out.println("1st class");
			return;
		}
		else if(avg>=50 &&m1>35 &&m2>35 &&m3>35) {
			System.out.println("2nd class");
			return;
		}
		
		else if(avg>35 &&m1>35 &&m2>35 &&m3>35) {
			System.out.println("3rd class");
			return;
		}
		else {
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		Student s=new Student(101, "Aritra", 70, 65, 80);
		s.calculate();
	}
}
