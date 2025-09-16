package com.core.deloitte.functional_interface_lambda;



//interface In1{
//	public void m1();
//}
//public class A {
//	public static void main(String[] args) {
//		int p=9;
//		In1 il=new In1() {
//			public void m1() {
//				System.out.println(p);
//			}
//		};
//		il.m1();
//	}
//}


//interface In1{
//	public String m1(String eName);
//}
//
//public class A{
//	public static void main(String[] args) {
//		int p=9;
//		In1 il=(eName)->{
//			return "Hello "+eName;
//		};
//		System.out.println(il.m1("Aritra"));
//	}
//}


interface In1{
	//public String m1(String eName);
	public int add(int a,int b);
}

public class A{
	public static void main(String[] args) {
		int p=9;
		In1 il=(a,b)->{
			return a+b;
		};
		System.out.println(il.add(5,10));
	}
}