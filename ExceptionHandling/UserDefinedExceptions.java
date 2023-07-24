import java.util.Scanner;
//Must inherit from either Exception class or RuntimeException class
//If it inherits from Exception, it becomes a checked exception.
//If it inherits from RuntimeException, it becomes an unchecked exception.
class UnEligibleException extends Exception //checked exception
{
	public UnEligibleException (String message) {
		super(message); //call super class constructor
	}
}
public class UserDefinedExceptions {
	public static void main(String[] args) {
		//Use Scanner class to take various kinds of data as input from 
		//the user. Like scanf() function in C.
		Scanner  scan =new Scanner(System.in);
		System.out.print("Enter your age(18-60 only) : ");
		int  age=scan.nextInt();
		if( !(age >= 18 && age <= 60))
		{
			try { 
				UnEligibleException  u=new UnEligibleException
					("Age must be between 18 and 60 only.");
				//All user-defined exceptions must be triggered using 
				//throws keyword.
				throw   u; //triggers a user defined exception.
			} catch(UnEligibleException  ue) {
				System.out.println("Error : " + ue.getMessage());
			}
		}else
			System.out.println("Considered your application...");
	}
}
