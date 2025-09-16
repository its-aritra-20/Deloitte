package com.deloitte.core.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hset {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("grape");
		h.add("mango");
		h.add("mango");
		h.add("apple");
		h.add("zebra");
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
