package com.java.collection;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, Integer> table = new Hashtable<>();
		table.put(8, 99);
		table.put(9, 100);
		table.put(10,101);
		table.put(null, 102);
		table.put(9, null);
		
		System.out.println(table.keySet());
		System.out.println(table.values());

	}

}
