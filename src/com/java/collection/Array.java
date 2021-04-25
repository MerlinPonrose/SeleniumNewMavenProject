package com.java.collection;

public class Array {

	public static void main(String[] args) {
		
	
		
		
		String[] name = {"sakthi","krithika","merlin"};
		System.out.println(name[0]); // accessing value through array
		
		int length = name.length;
		System.out.println("length of the array ="+length);
		
		
		for(int i=0;i<length;i++)
		{
			System.out.println(name[i]);
		}
		
		
		int[] num = {1,2,3,5};
		int total = 0;
		
		for(int i=0;i<num.length;i++)
		{
			total = total+num[i];
		}
		
		System.out.println("total="+total);
		
	}

}
