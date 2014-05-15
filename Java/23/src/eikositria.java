import java.util.*;

public class eikositria {

	public static void main(String args[])
	{
		try
		{
			Formatter f;
			
			f = new Formatter("C:\\My_projects\\test.txt");
			f.format("%s", "This text is printed by the Java program we made!");
			f.close();
			System.out.println("The file has been created successfully!");
		}
		
		catch(Exception r)
		{
			System.out.println("Error!");
		}
	}
}
