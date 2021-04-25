package com.testproject.java;

import java.util.Scanner;

public class GetUserData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number1");
		int num1 = scan.nextInt();
		
		System.out.println("enter number2");
		int num2 = scan.nextInt();
		
		int add = num1+num2;
		System.out.println(add);
		
		
		/*String name = scan.nextLine();
		System.out.println("String value="+name);
System.out.println("enter integer value");

int integerValue = scan.nextInt();
System.out.println("My integer value="+integerValue);


float number = scan.nextFloat();
System.out.println(number);*/

	}

}
