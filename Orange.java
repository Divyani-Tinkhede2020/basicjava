package javaPrograms;

class Apple
{
	Apple(int a)
	{
		System.out.println("Login to facebook.com");
	}
}

public class Orange extends Apple
{
	Orange()
	{
		super(7);
		System.out.println("Login credentials");
	}
	public static void main(String[] args)
	{
		
		new Orange();
	}
	
	
	
}
