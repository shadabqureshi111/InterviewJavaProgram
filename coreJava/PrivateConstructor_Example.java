package com.csm.coreJava;

class ConstructorExample
{
	private ConstructorExample()
	{
		System.out.println("Default Constructor in First Class");
	}
}


public class PrivateConstructor_Example 
{
	private PrivateConstructor_Example()
	{
		System.out.println("Default Constructor in Main Class");
	}

	public static void main(String[] args) 
	{
		PrivateConstructor_Example p = new PrivateConstructor_Example();
		//ConstructorExample c = new ConstructorExample();
		
	}

}
