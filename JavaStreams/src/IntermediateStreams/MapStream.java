package IntermediateStreams;

import java.util.Arrays;
import java.util.List;

public class MapStream {
	public static void main(String ...args)
	{
		List<Integer> squareList=Arrays.asList(2,4,6,8,10);
		
		squareList.stream().map(e->e*e).forEach(System.out::println);
		
		squareList.stream().map(e->e+e).forEach(System.out::println);
		
		squareList.stream().map(e->e-e).forEach(System.out::println);
		
		squareList.stream().map(e->e/e).forEach(System.out::println);
		
		squareList.stream().map(e->e%e).forEach(System.out::println);
		
		
	}

}
