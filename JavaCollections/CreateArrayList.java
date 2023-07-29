import java.util.*;
public class CreateArrayList
{
	public static void main (String args[])
	{
		ArrayList al = new ArrayList ();
		al.add ("Java");
		al.add (".NET");
		al.add ("Exilant");

		al.add (1, "J2EE");
		al.add (2, 100);

		MarutiCar c = new MarutiCar ();
		al.add (c);

		String s = new String ("Hello");

		al.add (s);

		System.out.println (al);
		System.out.println (al.size ());
		//System.out.println (al.getCapacity ());

		System.out.println ("Element @ 3 " + al.get(3));

		//System.out.println (c);

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
