package com.csm.coreJava;

class Example
{int i=10;
	Example()
	{
		System.out.println("Default Constructor of Class first");
	}
	Example(int a,int b)
	{
		System.out.println("Parameter Constructor of Class first");
	}
	
	void show(int a)
	{
		System.out.println("Method Show Call");
	}
}

class Example1 extends Example
{
	Example1()
	{
		super();
		System.out.println("Default Constructor of Class Second");
	}
	Example1(int a,int b)
	{
		this();
		System.out.println("Parameter Constructor of Class Second");
	}
	
	void show(int a,int b)
	{
		System.out.println(super.i);
		this.show(1);								//OUTPUT :Method Show Call
		super.show(2);								//OUTPUT :Method Show Call
		System.out.println("Method overloading");	//OUTPUT :Method overloading
		
	}
	
}

public class This_Super_Example
{
	public static void main(String[] args) 
	{
		Example1 e = new Example1(2,3);
		
		//e.show(1);
//		e.show(1,2);
	}
}
