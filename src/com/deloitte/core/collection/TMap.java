package com.deloitte.core.collection;

import java.util.Map;
import java.util.TreeMap;

public class TMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> h=new TreeMap<Integer,String>();
		h.put(100,"grape");
		h.put(101,"mango");
		h.put(105,"ango");
		h.put(102,"apple");
		h.put(104,"zebra");
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
