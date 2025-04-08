package javaPrograms;

public class Palendrome {

	public static void main(String[] args)
	{

		String input="mom";
		String output="";
		for(int i=input.length()-1; i>=0; i--)
		{
			     char a=input.charAt(i);
			     output=output+a;
		}
		System.out.println("The output of the given string is:-" + output);
		
	
	if(input.equals(output))
	{
		System.out.println("The given string is palendrome");
	}
	else
	{
		System.out.println("The given string is not palendome");

	}
	}
}
