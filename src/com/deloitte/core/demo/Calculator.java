//package com.deloitte.core.demo;
//
//import java.util.Scanner;
//
//public class Calculator {
//	
//	public static int sum(int num1,int num2) {
//		return num1+num2;
//	}
//	
//	public static int subt(int num1,int num2) {
//		return num1-num2;
//	}
//	
//	public static int prod(int num1,int num2) {
//		return num1*num2;
//	}
//	
//	public static double mod(int num1,int num2) {
//		return num1%num2;
//	}
//	
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in); //keyboard is attached to scanner
////		System.out.println("Enter your name: ");
////		String name=scanner.next();
////		System.out.println("Hello, "+name+", Welcome to Java Foundational Training Deloitte");
////		
//		System.out.println("Enter number 1: ");
//		int num1=scanner.nextInt();
//		System.out.println("Enter number 2: ");
//		int num2=scanner.nextInt();
//		
//		System.out.println("Sum of two numbers : "+sum(num1,num2));
//		System.out.println("Subtraction of two numbers : "+subt(num1,num2));
//		System.out.println("Product of two numbers : "+prod(num1,num2));
//		System.out.println("Modulus of two numbers : "+Calculator.mod(num1,num2));
//	
//	}
//}

package com.deloitte.core.demo;

import java.util.Scanner;

// A simple calculator program that performs basic arithmetic operations
public class Calculator {

    // Method to perform addition
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public static int subt(int num1, int num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public static int prod(int num1, int num2) {
        return num1 * num2;
    }

    // Method to perform modulus operation with division-by-zero check
    public static double mod(int num1, int num2) {
        return num2 != 0 ? num1 % num2 : Double.NaN;
    }

    // Main method to run the calculator menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        int choice; // Variable to store user's menu choice

        // Loop until user chooses to exit
        do {
            // Display calculator menu
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Modulus");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt(); // Read user's choice

            // If choice is between 1 and 4, perform the corresponding operation
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter number 1: ");
                int num1 = scanner.nextInt(); // Read first number
                System.out.print("Enter number 2: ");
                int num2 = scanner.nextInt(); // Read second number

                // Perform operation based on user's choice
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + sum(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subt(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + prod(num1, num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Result: " + mod(num1, num2));
                        }
                        break;
                }
            } else if (choice != 5) {
                // Handle invalid menu choices
                System.out.println("Invalid choice! Please select a valid option.");
            }

        } while (choice != 5); // Exit loop when user chooses option 5

        // Exit message
        System.out.println("Exiting Calculator. Thank you!");
        scanner.close(); // Close the scanner to free resources
    }
}