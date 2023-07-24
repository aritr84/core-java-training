//This program demonstrates creation of arrays dynamically.

public class PassArrays
{
	public static void ChangeArrays (byte BArr[])
	{
		for (int x=0;x<BArr.length;x++)
			BArr[x] = (byte)(BArr[x] + 100);
	}
	public static void main(String args[])
	{
		byte ByteArrays[] = new byte [10];
		ByteArrays[0]=10;
		ByteArrays[1]=20;
		ByteArrays[2] = 10;
		ChangeArrays(ByteArrays);
		for (int x=0;x<ByteArrays.length;x++)
			System.out.println (ByteArrays[x]);

	}
}