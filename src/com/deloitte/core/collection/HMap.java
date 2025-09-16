package com.deloitte.core.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HMap {
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(100,"grape");
		h.put(101,"mango");
		h.put(105,"mango");
		h.put(102,"apple");
		h.put(104,"zebra");
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
