package com.deloitte.core.stack_queue;

import java.util.Iterator;
import java.util.Stack;

public class StackImp {
	public void insert(Stack s,int n) {
		s.push(n);
	}
	public void deleteTop(Stack s) {
		s.pop();
	}
	public int displayTop(Stack s) {
		return (Integer)s.peek();
	}
	public void show(Stack s) {
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		StackImp a=new StackImp(); 
		Stack<Integer> stack=new Stack<>();
		a.insert(stack, 0);
		a.insert(stack, 1);
		a.insert(stack, 2);
		a.insert(stack, 3);
		a.insert(stack, 4);
		a.insert(stack, 5);
		a.insert(stack, 6);
		System.out.println(a.displayTop(stack));
		a.deleteTop(stack);
		a.show(stack);
	}
}
