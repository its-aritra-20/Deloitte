package com.deloitte.core.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vtor {
	public static void main(String[] args) {
		Vector<String> h=new Vector<String>();
		h.add("grape");
		h.add("mango");
		h.add("mango");
		h.add("apple");
		h.add("zebra");
		Enumeration<String> e=h.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
