package inheritance2;

public class Class2		//Access specifier case 2
{
public static void main(String[] args) 
{
	Class1.add();
	Class1.mul();
	Class1.sub();       	// div() method cannot be called here because it is private and cannot be called in another class
							
}
}

