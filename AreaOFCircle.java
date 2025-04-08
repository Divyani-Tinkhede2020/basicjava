package javaPrograms;

import java.util.Scanner;

public class AreaOFCircle
{

	public static void main(String[] args)
	{
		//pi*r*r
		System.out.println("Please enter the value of radius: ");
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();	
		double area=Math.PI*r*r;
		System.out.println("Area of circle = " +area);

		
		
	}

}
