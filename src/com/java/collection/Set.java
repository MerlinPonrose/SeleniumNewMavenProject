package com.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.HashSet<String> hashset = new java.util.HashSet<>();
		hashset.add("y");
		hashset.add("ll");
		hashset.add("y");
		hashset.add("lt");
		hashset.add("y");
		hashset.add("tl");
		hashset.add("y");
		hashset.add("kl");
		
		Iterator<String> it = hashset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		TreeSet<Integer>  treeset = new TreeSet<>();
		treeset.add(9);
		treeset.add(954);
		treeset.add(100);
		treeset.add(9);
		treeset.add(8);
	
		Iterator<Integer> it1 = treeset.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}

		
	LinkedHashSet<Integer> linkedhash = new LinkedHashSet<>();
	linkedhash.add(8);
	linkedhash.add(80);
	linkedhash.add(99);
	linkedhash.add(8);
	linkedhash.add(8);
	linkedhash.add(88);
	Iterator<Integer> it2 = linkedhash.iterator();
	
	while(it2.hasNext())
	{
		System.out.println(it2.next());
	}
	
	}

}
