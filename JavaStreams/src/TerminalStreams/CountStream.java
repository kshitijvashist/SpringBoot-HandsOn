package TerminalStreams;

import java.util.Arrays;
import java.util.List;

public class CountStream {
	
	public static void main(String ...args)
	{
		List<String> countList=Arrays.asList("Method Reference","For Each Java","Java Stream","Time Package","Java Lamda Expressions");
		
		long count=countList.stream().count();
		
		long countWithFilter=countList.stream().filter(e->e.startsWith("J")).count();
		
		System.out.println(count);
		System.out.println(countWithFilter);
		
		
		
	}


}
