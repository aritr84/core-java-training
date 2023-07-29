import java.util.Vector;
//Difference between size and capacity
public class VectorSizeCapacity {
	public static void main(String[] args) {
		
		Vector  VectOne=new Vector();
		System.out.println("Capacity : " + VectOne.capacity());
		VectOne.add("C++"); VectOne.add("New Delhi");
		VectOne.add("T20 WC"); VectOne.add(5000);
		VectOne.add(243.67f); VectOne.add('*');
		System.out.println("Size : " + VectOne.size());
		System.out.println("Capacity : " + VectOne.capacity());
		
		VectOne.add("C#"); VectOne.add(56); VectOne.add(false);
		VectOne.add(null); VectOne.add(5333.44f); VectOne.add(30);
		System.out.println("Size after add : " + VectOne.size());
		System.out.println("Capacity after add: " + 
				VectOne.capacity());
	}

}
