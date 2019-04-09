package pctPractice;
import java.util.Scanner;

public class SwitchControlsLights {

	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the maximum number ");
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		
		for (int i = 1; i <= n; i++)
			{
			 	System.out.print("* \t");
			 
			}
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("For 2 multiples \n");
		
		for (int i = 1; i <= n; i++)
			{
				if (i % 2 != 0)
					System.out.print("  \t");
				else
					System.out.print("* \t");
				
			}
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("For 3 multiples \n");
		
		//System.out.println((3/2));
		
		for (int i = 1; i <= n; i++)
		{
			
			if (i % 3 != 0)
				System.out.print(" \t");
			else
				System.out.print("* \t");
		}
	}
}
