package javaPrograms;

public class ReverseString1 {

	public static void main(String[] args)
	{

		String input="Divyani";
		String output="";
		for(int i=input.length()-1; i>=0; i--)
		{
			     char a=input.charAt(i);
			     output=output+a;
		}
		System.out.println("The output of the given string is:-" + output);
		
	}

}
