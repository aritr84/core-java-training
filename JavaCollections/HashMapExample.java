import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap  hmap = new HashMap();
		hmap.put("28.57751934794601, 77.19476095999657", "BabuMarket, Delhi");
		hmap.put("28.575993013438463, 77.19935290189856", "SarojiniNagar MetroStation, Delhi");
		hmap.put("12.988686626804366, 77.59761996607088", "Fortis Hosp, B'lore");
		hmap.put("22.565278929945094, 88.3555666679824",  "Esplanade, Kolkotta");
		LocalDate  today=LocalDate.now();
		hmap.put("today", today); //It is a heterogenous data structure
		System.out.println("Size : " + hmap.size());
		//Entries are stored according to hashing mechanism. Natural order is not preserved
		//Position and order of the entries depends upon the hash code of the key.
		System.out.println("Entries : " + hmap);
		System.out.println("Value : " + hmap.get("22.565278929945094, 88.3555666679824"));
		
		if(hmap.containsKey("12.988686626804366, 77.59761996607088"))
			System.out.println("Has an entry with this key");
		else
			System.out.println("No entry with this key ....");
		
		Set  keys=hmap.keySet();
		System.out.println("Key : " + keys);
		
		Collection values=hmap.values();
		System.out.println("Values : " + values);
		Object  objarr[]=values.toArray();
		List valueslist=Arrays.asList(objarr);
		System.out.println("List Of Values : " + valueslist);
		
		Set  entries=hmap.entrySet();
		System.out.println("Entries : " + entries);
		if(hmap.containsValue("Esplanade, Kolkotta"))
			System.out.println("Value present..");
		else
			System.out.println("Value not present..");
	}
}
