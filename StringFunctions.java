package javaPrograms;

public class StringFunctions 
{
	public static void main(String[] args)
	{
		String input="Divyani";
			int size=input.length();
		System.out.println(size);
		
		String input1="Tinkhede";
		System.out.println(input1.toLowerCase());
		System.out.println(input1.toUpperCase());
		
		
		//charAt - very important method
		
		String input2="DivyaniTinkhede";
			char output1=	input2.charAt(4);
			System.out.println(output1);
			int i=input2.indexOf('v');
			System.out.println(i);
			
			
		
		
		
		
		
		
	}
	
}
