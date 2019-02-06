package FunctionalInterfaceUsage;

import functionalInterfaces.UserDefindedFunctionalInterface1;

public class FunctionalInterfaceImplementation {
	public static void main(String args[])
	{
		StringBuilder myList=new StringBuilder("Functional");
		
		
		UserDefindedFunctionalInterface1 impl=(e)->{
			e=myList.append("Interface");
			return e;
		};
			
		System.out.println(impl.appendString(myList));
				
	}
	

}
