package twoDimensionalArray;

import java.util.Scanner;

public class TransposeTwoTypes 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the square  array: ");
		int a[][] = readArr();
		
		System.out.println("enter the non square matrix:");
		int d[][] = readArr();
		
		System.out.println("before transpose: ");
		System.out.println("the first array:");
		dispArr(a);
		
		System.out.println("before tanspose: ");
		dispArr(d);
				
		System.out.println("after the transpose based on square matrix: ");
		int c[][] = tansposeWithSquare(a);
		dispArr(c);
		
		System.out.println("after the tansepose based on the non square matrix:");
		int b[][] = tansposeWithNonsquare(d);
		dispArr(b);
		
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
		return a;
	}
	
	static void dispArr(int[][] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	static int[][] tansposeWithSquare(int[][] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a[i].length; j++) 
			{
				int t = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = t;
			}
		}
		return a;
	}
	
	static int[][] tansposeWithNonsquare(int[][] a)
	{
		int[][] c = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				c[j][i] = a[i][j];
			}
		}
		return c;
	}
}
