import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

//This example demonstrates the use of HashTable class
public class HashTableExample {
	public static void main(String[] args) {
		Hashtable htable=new Hashtable();
		//Like HashMap, Hashtable is also a key-value structure. Order of entires in Hashtable is not gauranteed.
		htable.put("India", "New Delhi");  htable.put("Peru", "Lima");
		htable.put("Japan", "Tokyo"); htable.put("Finland", "Helsinki");
		System.out.println(htable.size());
		System.out.println("Htable : " + htable);
		System.out.println("Finland : " + htable.get("Finland")); //Retireve data using the key. Keys are unique.
		if(htable.containsKey("India")) //Checks for the presence of the given key
			System.out.println("India is present.....");
			else
				System.out.println("India is not present.....");
		

		if(htable.contains("Lima")) //Checks for the presence of the given value...
			System.out.println("Lima is present.....");
			else
				System.out.println("Lima is not present.....");
		
		if(htable.equals("Tokyo"))
			System.out.println("Tokyo present.......");
		else
			System.out.println("Tokyo not present.......");
		
		Set hset=(Set)htable.entrySet(); //Retries a set of entries...
		System.out.println("Entries in set ....." + hset);
		String fincapital=(String) htable.remove("Finland");
		System.out.println("Removed the entry for " + fincapital);
		htable.replace("Japan", "TOKYO");
		System.out.println("htable after replacement...." + htable);
		if(htable.isEmpty()) //Checks if the Hashtable is empty...
			System.out.println("Htable is empty...");
			else
				System.out.println("Htable is not empty...");
	}

}
