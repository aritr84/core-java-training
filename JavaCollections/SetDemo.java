import java.util.HashSet;
public class SetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Chennai"); hs.add("New Delhi"); hs.add("Bangalore");
		hs.add("Ooty"); hs.add("Ahmedabad");
		System.out.println (hs.size()); //System.out.println (hs.capacity());
		System.out.println ("hs : " + hs);
		if (hs.contains("New Delhi"))
			System.out.println ("New Delhi is found...");
		else
			System.out.println ("New Delhi is not found...");
		if (hs.isEmpty())
			System.out.println ("Empty set...");
		else
			System.out.println ("Set is not empty...");
		
		HashSet hs1= new HashSet (); hs1.add("Chennai"); hs1.add("Ooty");
		hs1.add("Ahmedabad");
		if (hs.equals(hs1))
			System.out.println ("Both are equal");
		else System.out.println ("Both are not equal");
		if (hs.containsAll(hs1))
			System.out.println ("Both hs and hs1 are same...");
		else
			System.out.println ("Both hs and hs1 are not same....");
		hs.remove("Bangalore");
		System.out.println (hs.size ());
		hs.add("Bangalore");
		System.out.println (hs.size ());
		System.out.println ("-----------------------------------");
		System.out.println ("Set : " + hs);
		hs.remove("Bangalore");

		System.out.println (hs.size ());
		System.out.println ("Set : " + hs);
	
		
		System.out.println ("Chennai".hashCode());
		System.out.println ("New Delhi".hashCode());
		System.out.println ("Bangalore".hashCode());
		Car swift=new Car ();
		System.out.println (swift.hashCode());
}
}
