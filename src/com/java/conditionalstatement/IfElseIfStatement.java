package com.java.conditionalstatement;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 15;
		
		if(num<10)
		{
			System.out.println("number is less of 10");
		}
		
		else if(num<20)
		{
			System.out.println("num is less than 20");
		}
		else if(num<30)
		{
			
		}
		else
		{
			System.out.println("num is not less than 10 or 20");
		}
		
		
		

		//largest of 3 number
		
		int num1=3;
		int num2= 8;
		int num3 =1;
		
		
		
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is the largest number");
		}
		
		else if(num2>num3 && num2>num1)
		{
			System.out.println("num 2 is the largest number");
		}
		else
		{
			System.out.println("num3 is the largest number");
		}

	}
	
	
	

}
