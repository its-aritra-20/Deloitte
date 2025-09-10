package com.deloitte.core.wrapperclass;

import java.util.Scanner;

public class StudentMulti {
	
    String sname;
    Integer sid,m1, m2, m3;
    public StudentMulti(Integer sid, String sname, Integer m1, Integer m2, Integer m3) {
        this.sid = sid;
        this.sname = sname;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

	public void calculate() {
		Integer tot=m1+m2+m3;
		System.out.println("Total :"+tot);
		
		Integer avg=tot/3;
		System.out.println("Average :"+avg);
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int n=sc.nextInt();
		StudentMulti[] s=new StudentMulti[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student detail's !!");
			System.out.println("Enter Student sid");
			Integer sid=sc.nextInt();
			System.out.println("Enter Student Name");
			String sname=sc.next();
			System.out.println("Enter sub1 marks: ");
			Integer m1=sc.nextInt();
			System.out.println("Enter sub2 marks: ");
			Integer m2=sc.nextInt();
			System.out.println("Enter sub3 marks: ");
			Integer m3=sc.nextInt();
			s[i]=new StudentMulti(sid, sname, m1, m2, m3);
			
			
		}
		System.out.println("Student Grades");
		for(StudentMulti i:s) {
			System.out.println("sid: "+i.sid+" Name: "+i.sname);
			i.calculate();
		}
		
	}
}
