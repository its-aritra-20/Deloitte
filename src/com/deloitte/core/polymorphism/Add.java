package com.deloitte.core.polymorphism;

public class Add {
	public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public float add(int a, float b) {
        return a + b;
    }
    public float add(float a, int b) {
        return a + b;
    }
    
    public float add(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
    	
    	    Add adder = new Add();
    	    int result1 = adder.add(10, 20);
    	    System.out.println("add(int, int): " + result1);

    	    double result2 = adder.add(5.5, 4.5);
    	    System.out.println("add(double, double): " + result2);

    	    float result3 = adder.add(10, 3.5f);
    	    System.out.println("add(int, float): " + result3);

    	    float result4 = adder.add(2.5f, 8);
    	    System.out.println("add(float, int): " + result4);

    	    float result5 = adder.add(1.5f, 2.5f);
    	    System.out.println("add(float, float): " + result5);
    	}
}
    



