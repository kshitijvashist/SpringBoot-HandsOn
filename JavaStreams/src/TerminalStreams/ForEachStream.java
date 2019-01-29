package TerminalStreams;

import java.util.Arrays;
import java.util.List;

public class ForEachStream {
	
	public static void main(String ...args)
{
	List<String> printList=Arrays.asList("Method Reference","For Each Java","Java Stream","Time Package","Java Lamda Expressions");
	
	
		printList.stream().forEach(System.out::println);
	
}

}
