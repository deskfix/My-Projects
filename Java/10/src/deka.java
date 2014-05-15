import java.util.Scanner;

public class deka {

	public static void main(String args[])
	{
		test2 antikeimeno = new test2();
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		String age = x.nextLine();
		
		antikeimeno.methodos(age);
	}
}
