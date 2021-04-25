package com.java.exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int num =1;
			if(num>10)
			{
				throw new ArithmeticException("invalid number");
			}
			else
			{
				System.out.println("valid number");
			}
		}
catch(ArithmeticException e)
		{
	System.err.println("provide valid number");
		}
	}

}
