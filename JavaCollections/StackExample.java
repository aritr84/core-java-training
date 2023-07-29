import java.util.*;
public class StackExample
{
	public static void main (String args[])
	{
		Stack s = new Stack ();
		if (s.empty ())
			System.out.println ("Stack is empty.");
		else
			System.out.println ("Stack is not empty.");
		
		System.out.println("Size : " + s.size());
		s.push ("JAVA");
		s.push ("LANGUAGE");
		s.push ("SPECIFICATION");
		s.push(800); s.push(300);
		s.push(false);
		Pen  camlin=new Pen();
		s.push(camlin);
		
		if (s.empty ())
			System.out.println ("Stack is empty.");
		else
			System.out.println ("Stack is not empty.");

		System.out.println("Size : " + s.size());

		//If data is found return it's position. If not found return -1.
		//Position is relative to TOS.
		System.out.println ("Position of \"LANGUAGE\" : " + (s.search ("LANGUAGE")));
		System.out.println (s.peek ()); //Check what is there at TOS.
		System.out.println (s.pop ());
		System.out.println (s.pop ());
		camlin=null;
		System.out.println("S : " + s);
	}
}