package arrayOperations;

import java.util.Scanner;

public class CountPrime 
{
	static int[] readArr()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the array size: ");
		
		int n = s.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter the elements to add: ");
		for(int i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		s.close();
		return a;
	}
	
	static int primeCount(int a[])
	{
		int count = 0; 
		for(int i = 0; i < a.length; i++)
		{
			if(prime(a[i]))
				count++;
		}
		return count;
	}
	
	static boolean prime(int i)
	{
		int r = 2;
		while(r <= i / 2)
		{
			if(i % r == 0)
				return false;
			r++;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("let start the count: ");
		
		int a[] = readArr();
	    
	    int count = primeCount(a);
	    
	    System.out.println(count + " of prime number is the array is have..:");
	}
	

}
