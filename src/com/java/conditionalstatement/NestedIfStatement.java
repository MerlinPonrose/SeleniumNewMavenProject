package com.java.conditionalstatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 16;
		int wt = 50;
		
		if(age>=18)
		{
			if(wt>50)
			{
				System.out.println("eligible for blood donate");
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		
		else
		{
			System.out.println("age is less than 18");
		}

	}

}
