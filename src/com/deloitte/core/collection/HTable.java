package com.deloitte.core.collection;

import java.util.Hashtable;
import java.util.Map;

public class HTable {
	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		h.put(101,"grape");
		h.put(106,"mango");
		h.put(105,"mango");
		h.put(102,"apple");
		h.put(104,"zebra");
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
