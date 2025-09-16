package com.core.deloitte.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpDriver {
	public static void main(String[] args) {
		ArrayList<Emp> e=new ArrayList<Emp>();
		e.add(new Emp("500","Aritra",10000));
		e.add(new Emp("200","ritra",1000));
		e.add(new Emp("300","itra",100));
		e.add(new Emp("400","tra",10));
		Collections.sort(e,new CompBySal());
		Iterator il=e.iterator();
		while(il.hasNext()) {
			Emp e1=(Emp)il.next();
			System.out.println("Id: "+e1.eid+" Name: "+e1.name+" Salary: "+e1.salary);
		}
		Collections.sort(e,new CompByEid());
		il=e.iterator();
		while(il.hasNext()) {
			Emp e1=(Emp)il.next();
			System.out.println("Id: "+e1.eid+" Name: "+e1.name+" Salary: "+e1.salary);
		}
		Collections.sort(e,new CompByName());
		il=e.iterator();
		while(il.hasNext()) {
			Emp e1=(Emp)il.next();
			System.out.println("Id: "+e1.eid+" Name: "+e1.name+" Salary: "+e1.salary);
		}
	}
}
