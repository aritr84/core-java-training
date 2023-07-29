import java.util.HashSet;
import java.util.Spliterator;

public class HashSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet  hset = new HashSet();
		hset.add("Java"); hset.add("C#"); hset.add(899);
		Employee emp=new Employee(900, "Ranjith");
		hset.add(emp);
		Employee emp1=new Employee(908, "Aayush Arya");
		hset.add(emp1);
		System.out.println("Set : " + hset);
		System.out.println("Size : " + hset.size());
		hset.add(899);
		System.out.println("Set after adding : " + hset);
		System.out.println("Size : " + hset.size());
		if(hset.contains("Ranjith"))
			System.out.println("Ranjith already added");
		else
			System.out.println("Yet to add Ranjith");
		
		if(hset.remove(899))
			System.out.println("Successfully removed....");
		else
			System.out.println("Unable to remove....");
		
		/*Spliterator splititr=hset.spliterator();
		splititr.*/
		//hset.get(0); //Elements cannot be accessed using index no.
	}

}
