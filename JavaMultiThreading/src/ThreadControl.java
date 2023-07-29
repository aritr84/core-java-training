public class ThreadControl {
	//main thread
	public static void main(String[] args) {
		//Java object, but still not a thread
		//For main thread, priority will be medium.
		IndianTime indtime=new IndianTime ();
		//setName() is a built-in function used to assign a name to
		//a thread
		indtime.setName("IndianTime"); 
		indtime.setPriority(9); //High priority or Indian Time Thread
		//If true, thread runs in background and will have low priority
		//If false, thread runs in foreground and will have normal priority
		//indtime.setDaemon(true);
		
		USTime utime=new USTime (); 
		Thread  thr=new Thread(utime);
		thr.setName("USTime");
		//utime.setDaemon(true);
		thr.setPriority(3); //Low priority for US Time thread
		
		//start() is a built-in function that starts a thread and puts
		//it into execution. start() method invokes the run() method
		//of the appropriate thread.

		//At this point both indtime and thr becomes 2 separate threads
		//They also start execution
		indtime.start (); 
		thr.start ();

		for(int i=0;i < 1000000; i++)
			System.out.println("main()...");
		
		//indtime.run();//Normal function call
		
		System.out.println ("Main continues...");
		/*try {
		Thread.sleep(5000); } catch (InterruptedException ie) {}*/
		
		if (indtime.isAlive())
		{
			System.out.println (indtime.getName () + " is alive");
			//IndianTime thread is interrupted only once...
			indtime.interrupt ();
		}
		System.out.println (Thread.currentThread().getName() + 
				"waits for " + indtime.getName());
		
		//Main thread has to wait for IndianTime thread for 10 seconds
		try {
			indtime.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println ("Main terminates...");
	}
}
