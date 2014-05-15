
public class bike {

	private String first_name;
	private String last_name;
	private static int paragelia;
	
	public bike(String f ,String l)
	{
		first_name = f;
		last_name = l;
		paragelia++;
		System.out.println("Order No " + paragelia + "----> " + first_name + last_name  );
	}
	
}
