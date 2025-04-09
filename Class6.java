package inheritance2;

import inheritance1.Class7;

public class Class6
{

	public static void main(String[] args) {
		
		Class7.add();		//only public method can be called when no relation between classes and of different pckg
		Class7.sub(); 		//sub method cannot called because is is not public
	}
	
	
}
