package javaPrograms;

public class ThisCallStatement 
{
	ThisCallStatement()
	{
		this(67);
		System.out.println("Constructor 1");
	}
	ThisCallStatement(int a)
	{
		System.out.println("Constructor 2");
	}
	ThisCallStatement(int a, double b)
	{
		this();
		System.out.println("Constructor 3");
	}
	public static void main(String[] args)
	{
		new ThisCallStatement(66, 9.7);		
	}
	
}
