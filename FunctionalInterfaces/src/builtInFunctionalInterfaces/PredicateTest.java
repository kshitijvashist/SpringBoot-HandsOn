package builtInFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String args[])
	{
		int evenOddLitmusTest=10;
		
		Predicate<Integer> p=e->e%2==0;
		
		if(p.test(evenOddLitmusTest))
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
}
