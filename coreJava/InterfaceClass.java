package com.csm.coreJava;

interface ShowInterface
{
	void ShowInterfaceMethod();
	
	default void show()
	{
		System.out.println("Default Method In Interface");
	}
	
	static void show1()
	{
		System.out.println("Static Method in Interface");
	}
}

abstract class ShowClass implements ShowInterface
{
	abstract void show2();
	
	public void ShowInterfaceMethod()
	{
		System.out.println("Implement Interface Method in Abstract Class");
	}
}

public class InterfaceClass extends ShowClass
{
	
	@Override
	void show2() 
	{
		System.out.println("Extends Abstract Class Method in Main Class");
	}
	
	
	public static void main(String[] args) 
	{
		/* Direct Call By Interface Name */
		ShowInterface.show1();					//Output : Static Method in Interface
		
		InterfaceClass i = new InterfaceClass();
		
		i.show();							//Output : Default Method In Interface
		i.ShowInterfaceMethod();			//Output : Implement Interface Method in Abstract Class
		i.show2();							//Output : Extends Abstract Class Method in Main Class
		
		
	}

	

}
