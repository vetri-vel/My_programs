package twoDimensionalArray;

import java.util.Scanner;

public class CounEvenOdd 
{
	public static void main(String[] args) 
	{
		int[][] a = readArr(); 
		EvenOdd count = countEO(a);
		
		System.out.println("the count number is: " );
		System.out.println(count);
	}
	static int[][] readArr()

	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row size: ");
		int m = s.nextInt();
		System.out.println("enter the column size: ");
		int n = s.nextInt();
		
		int a[][] = new int[m][n];
		System.out.println("enter " + m * n + "  elements: ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j] = s.nextInt();
			}
		}
		s.close();
		return a;
	}
	
	static EvenOdd countEO(int[][] a)
	{
		EvenOdd eo = new EvenOdd();
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(a[i][j] % 2 == 0)
					eo.eve++;
				else
					eo.odd++;
			}
		}
		return eo;
	}
}


