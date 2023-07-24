import java.io.IOException;
public class CheckedExceptions {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a character...");
			int i=System.in.read ();
			System.out.println(i);
			if (i>=65 && i<=90)
				System.out.println 
					((char)i + " is an Upper case character.");
			else if (i>=97 && i<=122)
				System.out.println 
				((char)i + " is a Lower case character.");
			else
				System.out.println ("Special Character.");	
			} catch(IOException ioe) {
			System.out.println("Error : " + ioe.getMessage());
		}
	}
}
