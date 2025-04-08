package javaPrograms;
class Banana
{
	void add()
	{
		System.out.println("HEyyyyy");
	}
}
public class Baloons extends Banana		//method overriding
{

	void add()
	{
		super.add();
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		Baloons b1=new Baloons();
		b1.add();
	}
}
