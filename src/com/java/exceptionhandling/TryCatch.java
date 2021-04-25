package com.java.exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=8;
			int b=4;
			int c = a/b;
			System.out.println("in try");
			System.out.println(c);

		}
		catch(Exception e)
		{
			int a=8;
			int b=2;
			int c = a/b;
			System.out.println("in catch");
			System.out.println(c);

		}
		
		finally
		{
			System.out.println("In finally block");
		}

	}

}
