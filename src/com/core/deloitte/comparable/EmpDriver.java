package com.core.deloitte.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDriver {
	public static void main(String[] args) {
		ArrayList<Emp> e=new ArrayList<Emp>();
		e.add(new Emp("500","Aritra",10000));
		e.add(new Emp("200","ritra",1000));
		e.add(new Emp("300","itra",100));
		e.add(new Emp("400","tra",10));
		Collections.sort(e);
		for(Emp ee:e) {
			System.out.println("Id: "+ee.eid+" Name: "+ee.name+" Salary:"+ee.salary);
		}
	}
}
