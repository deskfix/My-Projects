import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class eikositessera {

	public static void main(String args[])
	{
		try
		{
			
			ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("C:\\My_projects\\other.dat"));
			
			int a;
			for(a=0; a<5; a++)
				object.writeInt(a);
				
					System.out.println("The data has been created successfully at the other.dat");
					object.close();
			
		}
		catch(Exception ex)
		{
			System.out.println("Error!");
		}
	}
}
