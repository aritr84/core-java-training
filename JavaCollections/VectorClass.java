import java.util.*;
public class VectorClass extends Vector
{
	public static void main (String args[])
	{
		Vector VectOne, VectTwo, VectThree, VectFour;
		//Creates an empty vector internally in Heap memory
		VectOne = new Vector ();

		/*if (args.length > 0)
			for (int x=0;x<args.length;x++)
				VectOne.add (args[x]);*/
		
		VectOne.add("C++"); VectOne.add("New Delhi");
		VectOne.add("T20 WC"); VectOne.add(5000);
		VectOne.add(243.67f); VectOne.add('*');

		System.out.println ("VectOne Size : " + VectOne.size ());
		System.out.println("VectOne data : " + VectOne);
		VectOne.add (4, "JAVA");
		System.out.println("VectOne data after adding : " + VectOne);
		System.out.println ("VectOne Size After Adding : " + VectOne.size ());
		
		
		
		VectTwo = new Vector ();
		VectTwo.add (VectOne);
		System.out.println("VectTwo  contents : " + VectTwo);
		System.out.println ("VectTwo Size After Adding : " + VectTwo.size ());
		
		Vector v5=new Vector();
		v5.addAll(VectOne);
		System.out.println("V5 data : " + v5);
		System.out.println("V5 SIZE : " + v5.size());
		
		//takes all the elements from VectOne and add it separately to VectThree
		VectThree = new Vector (VectOne); //VectOne is added as 1 atomic element.
		System.out.println("VectThree data : " + VectThree);
		System.out.println ("VectThree Size : " + VectThree.size ());
		System.out.println();

		VectThree.addElement (VectTwo);
		System.out.println ("VectThree Size : " + VectThree.size ());
		
		//Capacity - How many elements a Vector can store at any point of time.
		//Size - How many elements a vector is having currently.
		System.out.println ("VectThree Capacity : " + VectThree.capacity ());

		VectThree.clear ();//removes all the elements
		System.out.println ("VectThree Size after clear() : " + VectThree.size ());

		//create a replica or duplicate
		VectFour = (Vector)VectOne.clone (); 
		System.out.println("\n");
		System.out.println ("VectOne data : " + VectOne);
		System.out.println ("VectFour data : " + VectFour);

		System.out.println("\n");
		System.out.println ("VectOne : " + VectOne);
		System.out.println ("VectTwo : " + VectTwo);
		System.out.println ("VectThree : " + VectThree);

			//True if "BANGALORE" present. Else false.
		if (VectOne.contains ("BANGALORE"))
			System.out.println ("\"BANGALORE\" Found.");
		else
			System.out.println ("\"BANGALORE\" Not Found.");

		if (VectOne.contains ('*'))
			System.out.println ("* Found.");
		else
			System.out.println ("No stars");

	//Does VectOne contains all elements that is present in VectTwo ?
		if (VectOne.containsAll (VectTwo))
			System.out.println ("VectTwo elements found in VectOne.");
		else
			System.out.println ("VectTwo elements not found in VectOne.");

		VectTwo.clear(); VectTwo.addAll(VectOne);
		if (VectOne.containsAll (VectTwo))
			System.out.println ("VectTwo elements found in VectOne.");
		else
			System.out.println ("VectTwo elements not found in VectOne.");
		
		System.out.println("VectOne contents: \n");
		Object  o;
		for(int i=0;i<VectOne.size();i++) {
			o=VectOne.get(i);
			if(o  instanceof String) {
				String  str= (String)o;
				System.out.println(str);
			}
			if (o  instanceof Integer) {
				Integer  intr=(Integer)o;
				System.out.println(intr);
			}
			if (o  instanceof Double) {
				Double  intr=(Double)o;
				System.out.println(intr);
			}

			
		}
	}
}


