package com.core.deloitte.comparator;

import java.util.Comparator;

public class CompBySal implements Comparator{
	public int compare(Object o1,Object o2) {
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		if(e1.salary==e2.salary) {
			return 0;
		}else if(e1.salary>e2.salary){
			return 1;
		}
		return -1;
	}
}
