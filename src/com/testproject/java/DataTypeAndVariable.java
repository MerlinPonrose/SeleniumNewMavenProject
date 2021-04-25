package com.testproject.java;

public class DataTypeAndVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 9;
		byte byteNumber = 10;
		short shortNumber = 11;
		long longnumber = 100;
		float floatNumber = (float)7.6;
		double doublenumber = 18.90;
		char character = 'h';
		boolean booleanvalue= false;
		String name = "merlin6";
	/*	
	System.out.println("Integer value ="+number);
	System.out.println("Byte value ="+byteNumber);
	System.out.println("Short value ="+shortNumber);
	
	
		*/
		
		
		TestClass classname = new TestClass();
		classname.test4();
		
	int num = classname.numbervalue;
	
	int b = 9;
	int add = num+b;
	
		
	System.out.println(classname.numbervalue);
		
		DataTypeAndVariable data = new DataTypeAndVariable();
		//data.dataType2();
		data.dataType();
		data.testMethod();
		data.privateMethod();
		
		DataTypeAndVariable.dataType();
		
	}
	
public static void dataType()
{
	int number = 9;
	System.out.println("Integer value ="+number);
}
	
/*public int dataType2()
{
	int number =9;
	return number;
	
}*/
	public void testMethod()
	{
		System.out.println("print method");
	}
	
	
private void privateMethod()
{
	System.out.println("I am in private method");
}


protected void protectedMethod1()
{
	System.out.println("");
}


}
