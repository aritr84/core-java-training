import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
public class USTime extends Book implements Runnable {
	public void run ()
	{
		Date usnow, now;
		//while (true)
		for (int i=0;i<1000000;i++)
		{
			usnow=new Date (); //Current date and time in India
			//Assuming that US time is 11 hours behind
			usnow.setHours(usnow.getHours () - 13);
			
			//System.out.println (getName () +" : "
					//+ usnow.getHours () + ":" + usnow.getMinutes()
					//+ ":" + usnow.getSeconds());

			//Retrieve info on the current thread.
			Thread t=Thread.currentThread();
			System.out.println (t.getName () +" : " + usnow);
			
			try
			{Thread.sleep(2000); } 
			catch (InterruptedException ie)
			{}
		}
	}
}