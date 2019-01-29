package TerminalStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {
	
	public static void main(String ...args)
	{
		
		List<Integer> mapReduceList=Arrays.asList(3,5,7,9,12);
		
		
		Optional<Integer> sumCount=mapReduceList.stream().reduce((a,b)->(a+b));
		
		Optional<Integer> mapReduceCount=mapReduceList.stream().map(e->e/e).reduce((a,b)->(a+b));
		
		System.out.println(sumCount);
		System.out.println(mapReduceCount);
		
		
	}

}
