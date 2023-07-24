public class MultiDArrays {
	public static void main(String[] args) {
		//4 rows. 1st row 4 columns. 2nd and 3rd row 5 columns each.
		//This is Jagged arrays. No of columns are unequal in each row.
		float  reals[][] = {{88, 67, 87, 23}, {99, 67, 45, 223, 167}, {88, 67, 254, 36, 22}, {896, 235, 67}};
	
		System.out.println(reals.length);
		System.out.println(reals[2].length); //# of columns in 2nd row.
		System.out.println(reals[0].length); //# of columns in 1st row.
		
		System.out.println("reals : " + reals); //Starting address of the array. Starting address of 1st dimension. 
		System.out.println("reals[0] : " + reals[0]); //Starting address of the row # 0. Starting address of 2nd dimension.
		
		/*Write a for loop that prints all elements in the reals array. The output should be like this.
			88	67	87	23	
			99	67	45	223	167
			88	67	254	36	22
			896	235	67
			
			Each row must be displayed in separate line with proper tab spacing between the columns.
			use 2 for loops.
		*/
		
		/*Write a for-each loop that prints all elements in the reals array. The output should be like this.
		88	67	87	23	
		99	67	45	223	167
		88	67	254	36	22
		896	235	67
		
		Each row must be displayed in separate line with proper tab spacing between the columns.
		User 2 for-each. One for-each within another for-each loop.
	*/
	}

}
