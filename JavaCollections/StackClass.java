import java.util.*;
public class StackClass
{
	public static void main (String args[])
	{
		Stack st = new Stack ();
		st.push ("JAVA");
		st.push ("LANGUAGE");
		st.push ("SPECIFICATION");
		if (st.empty ())
			System.out.println ("Stack is empty.");
		else
			System.out.println ("Stack is not empty.");

		System.out.println ("Position of \"SUBRAMANYA\" : " + (st.search ("SUBRAMANYA")));
		System.out.println (st.peek ());
		System.out.println (st.pop ());
		System.out.println (st.pop ());
	}
}