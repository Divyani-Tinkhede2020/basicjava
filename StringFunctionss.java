package javaPrograms;

public class StringFunctionss 
{
public static void main(String[] args) 
{

	String name="Divyani Tinkhede";		//substring with single parameter
	String output=name.substring(8);
	System.out.println(output);
	
	String name2="Utsav Sherekar";
	String s=name2.substring(3);
	System.out.println(s);
	
	String name8="Divyani Tinkhede"; 	//substring with two parameters
	String s1=name8.substring(0, 7);
	System.out.println(s1);
	
	String input="computer";			//replace string
	String output7=	input.replace('c', 'k');
	System.out.println(output7);
	
	String name9="Divyani Tinkhede";		//replace a string 2
	String c=name9.replace("Tinkhede", "Sherekar");
	System.out.println(c);
	
	String input0="div siv tiv 88686868";			//replace all ( rigix number)
	//lets remove all numeric with nothing
	String op=input0.replaceAll("[0-9]", " ");	
	System.out.println(op);
	
	//lets remove all lower letters from the string
	
	String input5="Divyani Moreshwar Tinkhede";
	String output9=input5.replaceAll("[a-z]", "");
	System.out.println(output9);
	
	//lets remove all upper letters from the string
	
	String input8="Divyani Moreshwar Tinkhede";
	String ss=input8.replaceAll("[A-Z]", "");
	System.out.println(ss);
	

}
}
