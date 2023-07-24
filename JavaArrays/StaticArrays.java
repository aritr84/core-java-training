public class StaticArrays {
	//static array with elements initialized
	public static int SlNos[]= {90, 67, 345, 289, 21}; //Size is 5.
	/*static int IDs[5];
	 * 
	 *  C/C++ style of declaring an array. Not supported in Java.
	 */
	static int IDs[]= {88, 986, 223, 22, 67, 19, 78, 267, 13};
	//main() must be static always
	//From main() we can access only those elements which are defined as static.
	
	int  Age=22;
	public static void main(String[] args)
	{
		//Age++;
		//Like in C/C++, index starts from 0.
		System.out.println(IDs[3]);
		IDs[3]=IDs[3]+20;
		System.out.println(IDs[3]);
		//length is a built-in property for every array in Java.
		//SlNos.length=10; length is constant property and it cannot be modified.
		System.out.println(SlNos.length); //size of the array.
		System.out.println(IDs.length);
		
		/*details about the array
		elements are not printed. Only the META info is printed.
		[ - indicates that SlNos and IDs are arrays
		I - indicates the data type int. F-float, D-double, L-long,B-byte,S-short 
		hexadecimal values indicates the address of the array.
		*/
		System.out.println("SlNos : " + SlNos); 
		System.out.println("IDs : " + IDs);
		//for loop for printing all the elements in IDs array
		for(int i=0;i<IDs.length;i++)
			System.out.print(IDs[i] + "\t");
		System.out.println();
		
		//condensed for loop. Introduced in Java5(Java 1.5)
		for(int i=0; i<IDs.length; System.out.print(IDs[i++] + "\t"));
		
		System.out.println();
		System.out.println();
		
		for (int t :  SlNos)
			System.out.print(t + "\t");	
		System.out.println();
		
		int  dest[]= {80, 890, 342, 28, 65, 3};
		System.arraycopy(IDs, 0, dest, 0, 3);
		
		//System.arraycopy(IDs, 0, dest, 0, 8);
		System.out.println("Dest after copying....");
		
		for (int t :  dest)
			System.out.print(t + "\t");
	}
}
