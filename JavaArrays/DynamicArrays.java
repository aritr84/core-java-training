public class DynamicArrays {
	public static void main(String[] args) {
		//This creates space in the heap memory to store 10 elements.
		//All elements are initialized to respective default values depending upon the data type
		int SerialNos[]= new   int[10];
		boolean status[] = new  boolean[10];
		System.out.println(SerialNos[3]);
		System.out.println(SerialNos[8]);
		
		System.out.println(status[3]);
		System.out.println(status[8]);
		
		//Array initialization.
		long  aadhaarNos[]=new long[] {777222233, 888223355, 9892222, 887277299, 22883733};
		System.out.println(aadhaarNos[3]);
		
		try {//Monitor for exceptions.
			System.out.println(aadhaarNos[8]);
		}catch(ArrayIndexOutOfBoundsException   aiobe)
		{ //Remedial actions.
			//aiobe.getLocalizedMessage()
			System.out.println("Error : " + aiobe.getLocalizedMessage());
			System.out.println("The last element is 4 " );			
		}
		System.out.println("aadhaar # 4 : " + aadhaarNos[4]);

	}
}
