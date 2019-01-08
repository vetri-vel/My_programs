package arrayOperations;

import java.util.Scanner;

public class ZigZag 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the first arrray element:");
		int a[] = readArr();
		System.out.println("enter the second arrray element:");
		int b[] = readArr();
		int c[] = zigZag(a,b);
		
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i] + " ");
	}  
	static int[] readArr()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = s.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter the elements of array: ");
		
		for(int i = 0; i < a.length; i++)
				a[i] = s.nextInt();
		return a;
	}
	static int[] zigZag(int a[], int b[])
	{
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		
		while(i < a.length && j < b.length)
		{
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		while(i < a.length)
			c[k++] = a[i++];
		while(j < b.length)
			c[k++] = b[j++];
		return c;
	}
}
