package lambdaExpressionsUsage;

import Constants.InputDefinedConstants;
import functionalInterfaces.ISubstringUtility;

public class LamdaExpressionsDemo {
	public static void main(String args[])
	{
		String  myString=InputDefinedConstants.SUBSTRINGINPUT;
		
		
		ISubstringUtility iSubstring=(myTempString)->  {
			myTempString=myString.substring(myString.indexOf("<Java8>"),myString.indexOf("</Java8>"));
			
			return myTempString;
		};
		
		System.out.println("Substring Utility Using Functional Interface="+iSubstring.getSubstringData(myString));
		
		iSubstring.defaultMethodView1();
		
		iSubstring.defaultMethodView2();
		
	}

}