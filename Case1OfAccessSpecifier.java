package javaPrograms;

public class Case1OfAccessSpecifier 
{
	public static void add()
	{
		
	}
	private static void sub()
	{
		
	}
	protected static void mul()		//all methods are accessing because it is all within same class
	{
		
	}
	static void div()
	{
		
	}
	
	public static void main(String[] args) 
	{

		add();
		sub();
		mul();
		div();
		
	}

}
