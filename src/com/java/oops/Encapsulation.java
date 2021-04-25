package com.java.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int age;
	
	
	
	
	public void setAge(int newAge)
	{
		if(newAge>18)
		{
			age=newAge;
		
		}
		else
		{
			System.out.println("age not greater than 18");
		}
	}
	
	public int getAge()
	{
		return age;
	}

}
