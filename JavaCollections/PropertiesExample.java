import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

//This example demonstrates usage of Properties class
public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException {
		Properties  props=new Properties(); //Empty Properties
		System.out.println("Size : " + props.size()); //Returns the size of Properties. By default 0.
		props.put("Ten", 10); props.put("Eleven", 11); props.put("Twelve", 12); props.put("Thirteen", 13);
		System.out.println("Props - " + props); //Order of elements are not gauranteed...
		if(props.containsKey("Eleven")) //Returns true if given element exists. Else false....
			System.out.println("Eleven present....");
		else
			System.out.println("Eleven not present....");
		
		if(props.containsValue(10)) //Returns true if the given value exists. Else false...
			System.out.println("10 exists....");
		else
			System.out.println("10 doesn't exist....");
		
		int value=(Integer)props.get("Thirteen"); //Returns the value if the given key is present....
		System.out.println("Value : " + value);
		if(props.isEmpty()) //Returns true if props is empty. Else false.
			System.out.println("Empty....");
		else
			System.out.println("Not Empty....");
		
		Enumeration<Object> enm=props.keys(); //Returns an enumeration of keys. Navigate through the Enumeration to retrieve all the keys.
		System.out.println("Next : " + enm.nextElement()); //Returns the next element...Repeat until all elements are retrieved...
		while (enm.hasMoreElements()) //run the loop until all elements are exhausted..
			System.out.println("Next - "  + enm.nextElement());

		FileOutputStream fos=new FileOutputStream("Data.properties");//Create a properties file...
		props.save(fos, "Properties");//Writes the contents of this properties to the Data.properties file....
	}
}
