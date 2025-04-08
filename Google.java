package javaPrograms;
class Dmt
{
	Dmt() 
	{
		
		System.out.println("This is constructor 2");
	}
}
public class Google extends Dmt
{
	Google()
	
	{
		super();
		System.out.println("This is constructor 1");
	}
	
	public static void main(String[] args)
	{
		
		new Google();
		
		
	}
	
	
	
}
