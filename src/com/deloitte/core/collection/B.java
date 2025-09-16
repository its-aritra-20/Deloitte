package com.deloitte.core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(1,6,2,8,3));
		//Collections.sort(l);
		int mn=Collections.min(l);
		System.out.println(mn);
		int mx=Collections.max(l);
		System.out.println(mx);
		Collections.reverse(l);
		System.out.println(l);
		Collections.swap(l, 1, l.size()-1);
		System.out.println(l);
		Collections.shuffle(l);
	}
}
