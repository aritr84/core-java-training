public class MultipleExceptions {
	public static String s = "Hello World"; //valid indexes is from 0-10	
	public static void main (String args[])
	{

		try //Exception monitor
		{
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
		catch (ArithmeticException    e)
		{
			System.out.println ("Error : " +  e.getMessage());
			//e.printStackTrace ();
			System.out.println ("Length : " + s.length());
		}
		catch (ArrayIndexOutOfBoundsException  aioobe)
		{
			System.out.println ("Error : " +  aioobe.getMessage());
			//e.printStackTrace ();
			System.out.println ("Length is 3");
		}
		System.out.println ("Continuing with the program");
	}
}
