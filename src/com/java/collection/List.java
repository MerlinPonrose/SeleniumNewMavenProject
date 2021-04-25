package com.java.collection;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.ArrayList<Integer> arraylist = new java.util.ArrayList<>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(40);
		arraylist.add(40);
		arraylist.add(40);
	arraylist.set(1, 60); // updating value
	
	arraylist.remove(0);
	
	for(int i =0; i<arraylist.size();i++)
	{
		System.out.println(arraylist.get(i)); // retriving value from array
	}
	
	
	LinkedList<String> linkedlist = new LinkedList<>();

	linkedlist.add("ab");
	linkedlist.add("cd");
	linkedlist.add("ef");
	linkedlist.addFirst("hj");
	linkedlist.addLast("uu");
	linkedlist.removeFirst();
	linkedlist.set(3, "ll"); 
	
	for(int i =0; i<linkedlist.size();i++)
	{
		System.out.println(linkedlist.get(i)); // retriving value from array
	}
		
	}
	
	
	



}
