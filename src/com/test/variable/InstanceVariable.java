package com.test.variable;

public class InstanceVariable {
	
	String name = "merlin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable var = new InstanceVariable();
		InstanceVariable var1 = new InstanceVariable();
		InstanceVariable var2 = new InstanceVariable();
		
		var1.name = "India";
		System.out.println("print object var="+var.name);
		System.out.println("print object var1="+var1.name);
		System.out.println("print object var2="+var2.name);

	}
	
	

}
