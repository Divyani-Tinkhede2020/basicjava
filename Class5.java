package inheritance2;

import inheritance1.Class4;		//Access specifier case3

public class Class5 extends Class4
{

	public static void main(String[] args)
	{
	
		add();
		sub();
		mul();		//these two methods are private and default so it cannot called outside package
		div();
		
	}
}
