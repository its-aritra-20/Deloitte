package com.deloitte.core.polymorphism;
class D{
	void show() {
		System.out.println("I am from D");
	}
}
public class A extends D{
	void show() {
		System.out.println("I am from A");
	}
	public static void main(String[] args) {
		A a=new A();
		a.show();
	}
}
