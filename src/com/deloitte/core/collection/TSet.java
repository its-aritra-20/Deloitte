package com.deloitte.core.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TSet {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("grape");
		t.add("mango");
		t.add("mango");
		t.add("apple");
		t.add("zebra");
		Iterator<String> i=t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
