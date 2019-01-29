package IntermediateStreams;

import java.util.Arrays;
import java.util.List;

public class FilterStream {
	
	public static void main(String ...args)
	{
		List<String> filterList=Arrays.asList("Method Reference","For Each Java","Java Stream","Time Package","Java Lamda Expressions");
		
		filterList.stream().filter(e->e.contains("Java")).forEach(System.out::println);
		
		filterList.stream().filter(e->e.startsWith("J")).forEach(System.out::println);
		
		filterList.stream().filter(e->e.matches("Java Stream")).forEach(System.out::println);

		
	}


}
