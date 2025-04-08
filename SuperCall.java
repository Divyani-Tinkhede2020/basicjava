package javaPrograms;
class Apple1
{
	Apple1(int a )
	{
		System.out.println("HEllo");
	}
}
public class SuperCall extends Apple1
{

	SuperCall()
	{
		super(88);
		System.out.println("Hi");
	}
	
	public static void main(String[] args)
	{
		new SuperCall();
		
	}

}
