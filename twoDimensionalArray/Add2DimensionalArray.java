package twoDimensionalArray;
import java.util.Scanner;
public class Add2DimensionalArray 
{
	public static void main(String[] args) 
	{
		System.out.println("start process:");
		System.out.println("the first array: ");
		int[][] a = readArr();
		dispArr(a);
		
		System.out.println("the second array: ");
		int[][] b = readArr();
		dispArr(b);
		
		System.out.println("start to add array: ");
		int[][] c = addArr(a,b);
		if(c == null)
		{
			System.out.println("can't be add: ");
		}
		else
		{
			System.out.println("add process complet:");
			dispArr(c);
		}
		
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
	
	static int[][] addArr(int[][] a , int[][] b)
	{
		if(a.length != b.length && a[0].length != b[0].length)
			return null;
		
		int c[][] = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
