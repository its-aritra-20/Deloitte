package com.deloitte.core.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AList {
	public static void main(String[] args) {
		ArrayList<String> h=new ArrayList<String>();
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
