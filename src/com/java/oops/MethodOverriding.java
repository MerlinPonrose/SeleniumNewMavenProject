package com.java.oops;

public class MethodOverriding extends ClassA{
	
	public static int a = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println("value of a ="+a);
MethodOverriding override = new MethodOverriding();
override.display();
	}

	
	public void display()
	{
		this.a=7;
		System.out.println("value of a inside method="+a);
		super.display();
		System.out.println("in child class");
	}
}
