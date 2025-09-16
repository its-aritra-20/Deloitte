package com.core.deloitte.comparator;


import java.util.Comparator;

public class CompByName implements Comparator{
	public int compare(Object o1, Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		return e1.name.compareTo(e2.name);
	}
}

