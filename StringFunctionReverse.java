package javaPrograms;

public class StringFunctionReverse
{

	public static void main(String[] args) 
	{

		String input = "mouse";
		for(int i=4; i>=0; i--)
		{
		char a=	input.charAt(i);
		System.out.print(a);      //not a ideal way to reverse string
		}
		
		
	}

}
