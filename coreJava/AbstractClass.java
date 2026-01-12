package com.csm.coreJava;

abstract class A
{
	static int i=5;
	static void showStaticMethod()
	{
		System.out.println("Static Method");
	}
	
	
	A()
	{
		
		System.out.println("Default Constructor");
	}
	A(int i)
	{
		System.out.println("Parametarize Constructor");
	}
	
	
	abstract void display();
	
	
	
	void show()
	{
		System.out.println("Non-Abstract Method in Abstrat Class");
	}
}

class B extends A
{
	B()
	{
		super(10);  // Calling the parameterized constructor of class A with value 10
	}

	@Override
	void display() 
	{
		System.out.println("Class B inherit class A");
	}
	
	void MethodB()
	{
		System.out.println("Method Show In B Class");
	}
	
}

public class AbstractClass extends B
{
	
	public static void main(String[] args) 
	{
		System.out.println(A.i);			//Output : 5
		A.showStaticMethod();				//Output : Static Method
		
		AbstractClass a = new AbstractClass();
		
		a.display();						//Output :Parametarize Constructor
											//		  Class B inherit class A
		a.MethodB();						//Output : Method Show In B Class
		
		a.show();							//Output : 5Non-Abstract Method in Abstrat Class
		
		
		
	}

}