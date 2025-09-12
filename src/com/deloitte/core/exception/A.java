package com.deloitte.core.exception;

public class A {
	public static void main(String[] args) {
		try {
//			int i=10,j=0,k;
//			k=i/j;
//			System.out.println(k); 
			
			
//			String s="Aritra";
//			int i=Integer.parseInt(s);
//			System.out.println(i);
//			
			
//			String s=null;
//			System.out.println(s.length());
			
			int[] arr= {1,2,3,4};
			System.out.println(arr[4]);
			
		}catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("Catch 1");
		}catch(ArithmeticException n) {
			n.printStackTrace();
			System.out.println("Catch 2");
		}catch(NumberFormatException n) {
			n.printStackTrace();
			System.out.println("Catch 3");
		}catch(IndexOutOfBoundsException n) {
			n.printStackTrace();
			System.out.println("Catch 4");
		}catch(Exception n) {
			n.printStackTrace();
			System.out.println("Catch 5");
		}finally {
			System.out.println("Exception handled!");
		}
	}
}
