package com.deloitte.core.polymorphism;

public class Add {
	public int add(int a, int b) {
        return a+b;
    }
    
    public double add(double a,double b) {
        return a+b;
    }
    
    public float add(int a,float b) {
        return a+b;
    }
    public float add(float a,int b) {
        return a+b;
    }
    
    public float add(float a,float b) {
        return a+b;
    }
    public static void main(String[] args) {
    	    Add adder =new Add();
    	    int r1 = adder.add(10, 20);
    	    System.out.println("add(int, int): " + r1);

    	    double r2 =adder.add(5.5, 4.5);
    	    System.out.println("add(double, double) " + r2);

    	    float r3 =adder.add(10, 3.5f);
    	    System.out.println("add(int, float) " + r3);

    	    float r4 =adder.add(2.5f, 8);
    	    System.out.println("add(float, int) " + r4);

    	    float r5 =adder.add(1.5f, 2.5f);
    	    System.out.println("add(float, float) " + r5);
    	}
}
    



