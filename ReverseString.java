package javaPrograms;

public class ReverseString
{

	public static void main(String[] args)
	{

		String input="mouse";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
		char a=	input.charAt(i);
		output=output+a;	
		}
		System.out.println("The output of a given string is: " + output);
		
		
	}

}
