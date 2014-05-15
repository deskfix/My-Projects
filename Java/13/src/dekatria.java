
public class dekatria {

	public static void main(String args[])
	{
		int pin[][] = { {25,63,96,12,77} , {98,87,33,29,61} };
		int res[][] = { {99,79,20,52} , {74,40,83,51} , {34,10,27,59} };
		
		System.out.println("The array pin is this: ");
		appear(pin);
		
		System.out.println("The array res is this: ");
		appear(res);
		
	}
	
	public static void appear(int a[][])
	{
		for(int grammes = 0; grammes < a.length; grammes++)
		{
			for(int stiles = 0; stiles < a[grammes].length; stiles++)
			{
				System.out.print(a[grammes][stiles] + " ");
			}
			System.out.println();
		}
		
	}
}
