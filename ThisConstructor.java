package javaPrograms;

public class ThisConstructor 
{
	ThisConstructor()
	{
		this(7);
		System.out.println("12");
	}
	ThisConstructor(int a)
	{
		this(100,8.0);
		System.out.println("23");
	}
	ThisConstructor(int a , double b)
	{
		System.out.println("34");
	}
	public static void main(String[] args) 
	{
		
		 new ThisConstructor(); 
		
	}

}
