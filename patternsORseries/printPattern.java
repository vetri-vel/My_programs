package patternsORseries;
import java.util.Scanner;

public class printPattern 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the lines you want..: ");
		int n = s.nextInt();
		
		
		for(int a = 1; a <= n; a++)
		{
			for(int b = 1; b <= n; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int c = 1; c <= n; c++)
		{
			for(int b = 1; b <= c; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int a = 1; a <= n; a++)
		{
			for(int b = n; b >= a; b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int a = 1; a <= n; a++)
		{
			for(int b = 1; b <= n-a; b++)
			{
				System.out.print(" $ ");
			}
			for(int b = 1; b <= a; b++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int a = 1; a <= n; a++)
		{
			for(int b = 1; b <= n-a; b++)
			{
				System.out.print(" ");
			}
			for(int b = 1; b <= a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int a = 1; a <= n; a++)
		{
			for(int b = 1; b <= a-1; b++)
			{
				System.out.print(" ");
			}
			for(int b = 1; b <= (n - a + 1); b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int a = 1; a <= n; a++)
		{
			for(int b = 1; b <= n-a; b++)
			{
				System.out.print(" ");
			}
			for(int b = 1; b <= (2 * a - 1); b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	
	}
}
