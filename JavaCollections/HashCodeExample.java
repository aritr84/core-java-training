
public class HashCodeExample {

	public static void main(String[] args) {
		Employee emp=new Employee(900, "MJ Gosling");
		String str="Michael James Gosling";
		int emphcode=emp.hashCode();
		int  strhcode=str.hashCode();
		System.out.println(emphcode + ", " + strhcode);
		
		//JVM uses Mac Address of the machine to generate the hashCode
		//In the whole world, Mac addess
	}

}
