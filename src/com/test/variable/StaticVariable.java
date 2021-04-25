package com.test.variable;

public class StaticVariable {

	public static String name = "merlin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
				StaticVariable obj3 = new StaticVariable();
		
		obj2.name ="india";
	System.out.println("obj1 ="+obj1.name);	
	System.out.println("obj2 ="+obj2.name);	
	System.out.println("obj3 ="+obj3.name);	
	
	
		

	}
	
	public void display()
	{
		
		int a = 9;
		int b=10; // variable inside the method
	//final	 int a = 9; // once declared as final then the value cannot be changed
		//a=10;
	}

}
