import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class eikosipente {

	public static void main(String args[])
	{
		try
		{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\NVIDIA\\other.dat"));
			System.out.println("Reading binary file . . . .");
			
			int a1 = inputStream.readInt();
			int a2 = inputStream.readInt();
			
			System.out.println("The numbers that been readen are: ");
			System.out.println(a1);
			System.out.println(a2);
			
			inputStream.close();
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("Unable to find binary file");
		}
		catch(IOException ex)
		{
			System.out.println("Unable to read binary file");
		}
		System.out.println("End of application");
	}
	
}
