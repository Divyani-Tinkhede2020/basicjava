package javaPrograms;

public class StringFunctions3 {

	public static void main(String[] args) 
	{
		String input="   My name is Divyani Tinkhede    ";
		System.out.println(input);
		String output=input.trim();
		System.out.println(output);
		
		String name1="ram";			//equals function/method
		String name2="Ram";
		boolean b1= name1.equals(name2);
		System.out.println(b1);
		
		String name3="Divyani";		//EqualsEgnoreCase
		String name4="divyani";
		boolean b2=name3.equalsIgnoreCase(name4);
		System.out.println(b2);
		
		String name="Divyani Tinkhede";
		boolean b=name.contains("Tinkhede");
		System.out.println(b);
		
		
				
				
		
	}

}
