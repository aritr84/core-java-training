import java.util.*;
class VecExample {
 public static void main(String args[]) {
	Vector v = new Vector(5, 2);
	System.out.println("Initial Size: "  + v.size());          
	System.out.println("Initial Capacity: " + v.capacity());
	v.addElement(new Integer(10));
	v.addElement(new Integer(20));
	v.addElement(new Integer(30));
	v.addElement(new Integer(40));
	v.addElement(new Integer(50)); 
	v.addElement(new Double(60));
	System.out.println("Capacity after 6 Additions :"+v.capacity());
	System.out.println("FirstElement :" + (Integer)v.firstElement()); 
	System.out.println("LastElement :"  + (Double)v.lastElement());
	if(v.contains(new Integer(10)))
	System.out.println("Vector contains 10");
	Enumeration enum = v.elements();
	System.out.println("\n Elements in Vector v are: "); 
	while(enum.hasMoreElements())
	System.out.println(enum.nextElement()+ " "); 
	}
}
