package javaPrograms;
class ParentClass
{
	void Login()
	{
		System.out.println("Login with emain id ");
	}
	
	
}
public class MethodOverriding extends ParentClass
{
	void Login()
	{
		super.Login();        //super keyword for parent class implementation
		System.out.println("Login with mobile number ");
	}

	public static void main(String[] args)
	{
		MethodOverriding m1=new MethodOverriding();
			m1.Login();	
	}
	
}
