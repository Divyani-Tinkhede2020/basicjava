package inheritance2;
class two_2
{
	static void mul()
	{
		System.out.println("Hii");
	}
}
class three_3 extends two_2
{
	static void add() 
	{
		System.out.println("Bye");
	}
}
public class one_1 extends three_3
{
	static void addd()
	{
		System.out.println("xyz");
	}
	public static void main(String[] args) 
	{
		
		addd();
		add();
		mul();
		
	}
	
	
	
}
