package com.java.collection;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
		map.put("Merlin", 01); // put for adding key and values
		map.put(null, null);
		map.put(null, null);
		map.put(null,04);
		
		
		System.out.println(map.get("null"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
	}

}
