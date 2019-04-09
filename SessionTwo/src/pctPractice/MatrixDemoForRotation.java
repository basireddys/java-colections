package pctPractice;

public class MatrixDemoForRotation {

	public static void main (String args[])
	{
		int initial[][] = new int[3][3];
		
		initial[0][0] = 10;
		initial[0][1] = 20;
		initial[0][2] = 30;
		initial[1][0] = 20;
		initial[1][1] = 40;
		initial[1][2] = 20;
		initial[2][0] = 60;
		initial[2][1] = 50;
		initial[2][2] = 70;
		
		System.out.println("Intial given matrix:");
		
			for (int i = 0; i < initial.length; i++)
			{
				for (int j = 0; j < initial[0].length; j++)
				{
					 System.out.print(initial[i][j] + "\t");	
				}
				System.out.println();
			}
			System.out.println(initial.length);
			System.out.println(initial[0].length);
			
			System.out.println("Anti-clockwise rotate of given matrix:");
			for (int i = initial.length-1; i >= 0; i--) // 2 
			{
			for (int j = 0; j < initial[i].length; j++) // 0
			{
			//result[j][i] = initial[i][j];
			System.out.print(initial[j][i] + "\t");	
			}
			System.out.println();
			
			
			}
			
			System.out.println("Clock-wise rotate of given matrix:");
			for (int i = 0; i < initial.length; i++)
			{
					for (int j = initial.length-1; j >= 0; j--) 
					{
					//initial[i][j] = initial[k][i];
						
					System.out.print(initial[j][i] + "\t");	
					}
					System.out.println();
				}
			}
	
     }
