import java.util.Date;
//Thread is a built-in class
public class IndianTime extends Thread {
	//Every thread in Java will have a run() method.
	public void run ()
	{
		Date now;
		//while(true)
		for (int i=0;i<1000000;i++)
		{
			now=new Date (); //Retrieves the date and time in your machine
			//getName() returns the name of the thread.
			System.out.println (getName () +" : "
					+ now);
		
			try
			{
				//Priority is defeated or does not become important.
				//sleep() is a built-in function. It makes a thread
				//inactive for the given amt of time. Time given in
				//milli-seconds
				sleep(2000); //2 seconds
			}
			catch (InterruptedException ie)
			{
				System.out.println (getName () + " interrupted...");
			}
		}
	}
}
