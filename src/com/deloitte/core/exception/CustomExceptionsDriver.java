package com.deloitte.core.exception;

public class CustomExceptionsDriver {
	public void show(int age) throws MyExcep{
		if(age>60) {
			throw new MyExcep(age);
		}else {
			System.out.println("Congratulations application approved... "+age);
		}
	}
	public static void main(String[] args) {
		int p=61;
		CustomExceptionsDriver c=new CustomExceptionsDriver();
		try {
			c.show(p);
		}catch(MyExcep e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
	}
}
