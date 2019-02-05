package functionalInterfaces;

@FunctionalInterface
public interface ISubstringUtility {

	public  String getSubstringData(String inputString);
	
	public default void defaultMethodView1()
	{
		System.out.println("This is a default method 1 in Functional Interface");
	}
	
	public default void defaultMethodView2()
	{
		System.out.println("This is a default method 2 in Functional Interface");
	}
}
