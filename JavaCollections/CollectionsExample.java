import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionsExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(100); list.add(300); list.add(30); list.add(95);
		
		Collections.sort(list);
		System.out.println("Sorted list : " + list);
		//List must be sorted before binarySearch()
		System.out.println("Position of 100 : " + Collections.binarySearch(list, 100));
		
		LinkedList  list2=new LinkedList();
		list2.add(399); list2.add(278); list2.add(896); list2.add(332); list2.add(356);
		System.out.println("List2 before copy : " + list2);
		//copy(dest, source)
		Collections.copy(list2, list);
		System.out.println("List2 after copy : " + list2);
		Collections.fill(list, 100);
		System.out.println("List after fill : " + list);
		//How many times a value repeats in a list ?
		System.out.println("100 repeats " + Collections.frequency(list, 100) + " time(s)");
		list2.addAll(list);
		int pos=Collections.indexOfSubList(list2, list);
		System.out.println("List2 after adding : " + list2);
		System.out.println("list elements found @ " + pos);
		Collections.sort(list2, Comparator.reverseOrder());
		System.out.println("Reverse sorting list 2 : " + list2);
		
		Collections.swap(list2, 1, 8);
		System.out.println("After swapping 1 with 8 : " + list2);
		
		Collections.reverse(list2);
		System.out.println("After reverse : " + list2);
		Collections.replaceAll(list2, 100, 10);
		System.out.println("After replace : " + list2);
	}
}
