import java.util.Random;
class ArrayDemo
{
	public static void main(String s[])
	{
		 int x[][] = new int [5][];

		Random r = new Random();
		// loop to create a non rectangular array;
		for(int i=0;i<x.length;i++)
		{
			x[i]=new int[i+1];
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=r.nextInt(50);		   
			}			
		}
		// loop to display a non rectangular array;
		for(int i=0;i<x.length;i++)
		{			
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+"\t"); 
			}			
			System.out.println(); 
		}
	}
}