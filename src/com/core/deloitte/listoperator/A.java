package com.core.deloitte.listoperator;

import java.util.ArrayList;
import java.util.ListIterator;

public class A {
	 public static void main(String[] args) {
		//ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,8,20,4));
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(20);
		ListIterator<Integer> ls=null;
		
		ls=l.listIterator();
		ls.next();
		ls.remove();
		System.out.println("Natural Order of element:");
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
		System.out.println("Reverse Order");
		while(ls.hasPrevious()) {
			System.out.println(ls.previous());
		}
		ArrayList<String> str=new ArrayList<String>();
		str.add("hello");
		str.add("world");
		str.add("good");
		str.add("morning");
		ListIterator<String> s=str.listIterator();
		s.next();
		s.remove();
		System.out.println(str);
	 }
}
