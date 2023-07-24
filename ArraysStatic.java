//This program demonstrates creation of arrays statically.
public class ArraysStatic
{
	int SlNo;
	public static final byte ByteArrays [] = {99,67,34,20,123};
	public static short ShortArrays [] = {2,7854,12,309,24006};
	public static char CharArrays [] = {'V','J','^','~','E'};
	public static int IntArrays [] = {23008,1,29,408,7518};
	public static long LongArrays [] = {33,8889,20091,875,98766876};

	public static void main(String args[])
	{
		System.out.println ("IntArrays : " + IntArrays);
		System.out.println ("Byte Arrays : " + ByteArrays);
		System.out.println ("Char Arrays : " + CharArrays);
		ByteArrays[4] = 103;
		System.out.println (CharArrays[3]);
		CharArrays[2] = (char)ByteArrays[3];

		for (int x=0;x<5;x++)
			System.out.println (IntArrays[x]);

		//IntArrays.length++;
		for (int x=0;x<IntArrays.length;x++)
			System.out.println (IntArrays[x]);

		System.out.println ("Long Array length : " + LongArrays.length);

		for (int x=0;x<CharArrays.length;x++)
			System.out.println (CharArrays[x]);
		//ByteArrays = new byte [10];
	}
}