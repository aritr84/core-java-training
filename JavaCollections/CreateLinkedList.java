import java.util.*;
public class CreateLinkedList
{
	public static void main (String args[])
	{
		LinkedList al = new LinkedList ();
		al.add("Java");
		al.add (".NET");
		al.add ("Exilant");

		al.add (1, "J2EE");
		al.add (2, 100);

		MarutiCar c = new MarutiCar ();
		al.add (c);

		System.out.println (al);

		ListIterator li = al.listIterator(0);
		while (li.hasNext ())
			System.out.println (li.next ());

		System.out.println ("***");
		while (li.hasPrevious ())
			System.out.println (li.previous ());
	}
}

class MarutiCar
{
	String ModelName="Swift";
	public String toString ()
	{
		return ModelName;
	}
}
