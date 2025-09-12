package com.deloitte.core.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		h.add("grape");
		h.add("mango");
		h.add("mango");
		h.add("apple");
		h.add("zebra");
		h.add(null);
		h.add(null);
		
		Iterator<String> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
