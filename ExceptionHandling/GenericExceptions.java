//Program size is becoming bigger. 
//So, how to reduce it or control it without compromising the 
//robustness of the program ?
public class GenericExceptions {
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
		//ArithmeticException treated separately
		//Specific catch block
		catch (ArithmeticException    e)
		{
			System.out.println ("Error : " +  e.getMessage());
			//e.printStackTrace ();
			System.out.println ("Length : " + s.length());
		}
		//Specific catch block
		catch (ArrayIndexOutOfBoundsException  aioobe)
		{
			System.out.println ("Error : " +  aioobe.getMessage());
			//e.printStackTrace ();
			System.out.println ("Length is 3");
		}
		//Specific catch block
		catch (StringIndexOutOfBoundsException  sioobe)
		{
			System.out.println ("Error : " +  sioobe.getMessage());
			//e.printStackTrace ();
			System.out.println ("Length is 3");
		}
		//Apart from the above exceptions, if any other exception
		//happens the below Generic catch block is executed 
		catch (Exception  e) //Exception means common/generic
		{
			System.out.println ("Error : " +  e.getMessage());
			//e.printStackTrace ();
			System.out.println ("Mention only numbers in double quoted.");
		}
		System.out.println ("Continuing with the program");
	}
}
