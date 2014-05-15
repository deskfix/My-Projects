
public class dwdeka {

	public static void main(String args[])
	{
		int pin[] = {53,84,56,91,49,28};
		
		int sum = 0;
		
		for(int i = 0; i < pin.length; i++)
		{
			sum = sum+pin[i];
		}
		System.out.println("the sum of elements in the array is: " +sum);
	}
	
}
