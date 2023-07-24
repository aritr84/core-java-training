//Program size is becoming bigger. 
//So, how to reduce it or control it without compromising the 
//robustness of the program ?
public class SimpleGenericExceptions {
	public static String s = "Hello World"; //valid indexes is from 0-10	
	public static void main (String args[])
	{
		try //Exception monitor
		{
			Integer.parseInt("100s"); // convert from "100" to 100
			System.out.println("Char @ pos 15 : " + s.charAt(15));
			System.out.println ("Before Exception.");
			int result=s.length() /0; // 11 / 0
			char  charr[]= {'C', 'T', 'S'};
			charr[4]='L';
			System.out.println(s.charAt(15));

			//int result=s.length();
			System.out.println ("After Exception.");
			System.out.println("Result : " + result);
		}
		//Generic catch block that handles all exceptions in Java.
		catch (Exception  e) //Exception means common/generic
		{
			System.out.println ("Error : " +  e.getMessage());
			//e.printStackTrace ();
			System.out.println ("Error rectified.");
		}
		
		System.out.println ("Continuing with the program");
	}
}
