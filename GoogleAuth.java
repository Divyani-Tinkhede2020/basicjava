package javaPrograms;
abstract class Google1		//abstract class
{
	abstract void log();		//abstract method
}
public class GoogleAuth extends Google1
{
	public static void main(String[] args)
	{
		
	}

	void log() 
	{
		System.out.println("ogin with ID");
	}		
}
