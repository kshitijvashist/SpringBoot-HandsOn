package IntermediateStreams;

import java.util.Arrays;
import java.util.List;

public class SortedStream {
	
	public static void main(String ...args)
	{
		List<String> sortedList=Arrays.asList("Class","Objects","Abstraction","Inheritance",
				"Encapsulation","Message Passing","Dynamic Binding");
		
		List<Integer> sortedNumerals=Arrays.asList(100,45,98,10,07);
		
		
		sortedList.stream().sorted().forEach(System.out::println);
		
		sortedNumerals.stream().sorted().forEach(System.out::println);
		
		
	}

}
