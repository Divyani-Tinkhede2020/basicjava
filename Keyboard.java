package javaPrograms;
class Delete
{
	Delete()
	{
		System.out.println("Constr 2");
	}
}
public class Keyboard 
{
	Keyboard()
	{
		super(115);
		System.out.println("Constr 1");
		
	}
	Keyboard(int a)
	{
		System.out.println("No");
	}
	
	public static void main(String[] args)
	{
	
		new Keyboard()
	}
}
