import java.util.*;
public class LinkedListClass
{
	public static LinkedList LinkListOne, LinkListTwo;
	public static void main (String args[])
	{
		LinkListOne = new LinkedList ();
		if (args.length > 0)
		{
			for (int x=0;x<args.length;x++)
				LinkListOne.add(args[x]);
		}
		System.out.println ("Size : " + LinkListOne.size ());

		LinkListOne.add (LinkListOne.size (), "BANGALORE");
		System.out.println ("Size : " + LinkListOne.size ());

		LinkListTwo = new LinkedList (LinkListOne);
		System.out.println ("LinkListTwo Size : " + LinkListTwo.size ());

		LinkListTwo.addAll (LinkListOne);
		System.out.println ("ListListTwo Size : "+ LinkListTwo.size ());
		
		LinkListTwo.addAll (LinkListTwo.size (), LinkListOne);
		System.out.println ("LinkListTwo Size : "+ LinkListTwo.size ());

		LinkListTwo.addFirst (LinkListOne);
		System.out.println ("LinkListTwo Size : " + LinkListTwo.size ());
		LinkListTwo.addLast (LinkListOne);
		System.out.println ("LinkListTwo Size : "+ LinkListTwo.size ());
		//System.out.println ("LinkListTwo Size : "+ LinkListTwo.size ());

		System.out.println ("Size Of LinkListOne before clearing : " + LinkListOne.size ());
		LinkListOne.clear ();
		System.out.println ("Size Of LinkListOne after clearing : " + LinkListOne.size ());

		LinkedList LinkListThree = (LinkedList) LinkListTwo.clone ();
		System.out.println ("HashCode Of LinkedListTwo : " + LinkListTwo.hashCode ());
		System.out.println ("HashCode of LinkedListThree : " + LinkListThree.hashCode ());

		System.out.println ("LinkListTwo contains \"srivatasa\" ? " + LinkListTwo.contains ("Srivatsa"));
		System.out.println ("Contents of Linked List : \n**************************");
		String str=null;

		PrintList (LinkListTwo);
		System.out.println ("First : " + LinkListTwo.getFirst ());
		System.out.println ("Last : " + LinkListTwo.getLast ());

		System.out.println ("Index of \"Subramanya\" : " + LinkListTwo.indexOf("Subramanya"));
		System.out.println ("LastIndex of \"Subramanya\" : " + LinkListTwo.lastIndexOf ("Subramanya"));

		//Bi-directional traversal/navigation
		ListIterator li = LinkListTwo.listIterator ();
		System.out.println ("\nFirst to Last : ");
		while (li.hasNext ())
		{
			Object o = li.next ();
			System.out.println (o);
		}
		System.out.println ("\nLast to First : ");
		while (li.hasPrevious ())
		{
			Object o = li.previous ();
			System.out.println (o);
		}

		System.out.println ("Next Index : " + li.nextIndex ());
		System.out.println ("Previous Index : " + li.previousIndex ());

		while (li.hasNext ())
		{
			li.next ();
		}
		li.add ("Java");
		while (li.hasPrevious ())
		{
			li.previous ();
		}
		while (li.hasNext ())
		{
			Object o = li.next ();
			System.out.println (o);
		}
		System.out.println ("*");
		for (int x=0;x<LinkListTwo.size ();x++)
		{
			Object o = LinkListTwo.get(x);
			System.out.println (o);
		}

		while (li.hasPrevious ())
		{
			li.remove ();
			li.previous ();
		}
		System.out.println ("LinkListTwo Size : " + LinkListTwo.size ());


		//String s = (String)LinkListTwo.peek ();
		//System.out.println ("Peeked String : " + s);

		System.out.println ("Size Before Removing : " + LinkListThree.size ());
		if (LinkListThree.remove ("BANGALORE"))
			System.out.println ("\"BANGALORE\" Found And Removed.");
		else
			System.out.println ("\"BANGALORE\" Not Found.");
		System.out.println ("Size After Removing : " + LinkListThree.size ());
		

		System.out.println ("\nFirst to Last After Removing : ");
		li = (ListIterator)LinkListThree.iterator ();
		while (li.hasNext ())
		{
			Object o = li.next ();
			System.out.println (o);
		}

		System.out.println ("Size Before Removing : " + LinkListThree.size ());
		LinkListThree.removeFirst ();
		LinkListThree.removeLast ();
		System.out.println ("Size After Removing : " + LinkListThree.size ());
		LinkListThree.add (new Integer (100));
		System.out.println ("Size After Adding : " + LinkListThree.size ());
		LinkListThree.remove (3);
	}

	public static void PrintList (LinkedList LL)
	{
		String str;
		Object o;
		for (int x=0;x<LL.size ();x++)
		{
			o = LL.get(x);
			if (o instanceof String)
			{
				str=(String)o;
				System.out.println (str);
			}
		}
	}
}