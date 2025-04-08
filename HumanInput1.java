package javaPrograms;
import java.util.Scanner;
public class HumanInput1
{
public static void main(String[] args)
{
	
	Scanner s1=new Scanner(System.in); //constructor
		System.out.println("Please enter the value of a:");
		int a=	s1.nextInt();  //method of scanner class
		System.out.println("Please enter the value of b:");
		int b= s1.nextInt();   //method of scanner class
		System.out.println("Sum of a and b is 89 :");

		int sum=a+b;
		System.out.println(sum);
		s1.close();
}
}
