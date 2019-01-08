package arrayOperations;

import java.util.Scanner;

public class ArrayWork 
{
	public static void main(String[] args) 
	{
		
		System.out.println("the prograss is started..: ");
		int a[] = readArr();
		sumANDavg(a);
		smallEle(a);
		armstrongNum(a);
		deseriumNum(a);
		palindrome(a);
	}
			
	/*
	 * the read the array elements..
	 */
	static int[] readArr()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the array size: ");
		int n = s.nextInt();
		int[] a = new int[n];
		
		System.out.println("enter the "+ n +" elements of array");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		s.close();
		return a;
	}
	
	/*
	 * find the sum and avg of the array..
	 */
	
	static void sumANDavg(int a[])
	{
		System.out.println("your array elements are: ");
		int  sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
			System.out.println();
			sum = sum + a[i];
		}
		System.out.println("the sum of the elements are: " + sum);
		System.out.println("the avg of the elements are: " + sum / a.length);
		System.out.println();
	}
	
	/*
	 * find the smallest element in array..
	 */
	
	static void smallEle (int a[])
	{
		int t = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(t > a[i])
				t = a[i];
		}
		System.out.println("the smallest element in array: " + t);
		System.out.println();
	}
	
	/*
	 * find how many armstrong number is the array..
	 */
	
	static void armstrongNum(int a[])
	{
		int count = 0;
		int c;
		for(int i = 0; i < a.length; i++)
		{
			int s = 0;
			c = countDig(a[i]);
			int b = a[i];
			while(b != 0)
			{
				int r = b % 10;
			    s = s + armstrong(r,c);
				b = b / 10;
			}
			if(a[i] == s)
				count++;	
		}
		System.out.println("armstrong number present in array: "+ count);
		System.out.println();
	}
	
	/*
	 * the armstrong method is started here...
	 */
	static int countDig(int c)
	{
		int count = 0;
		do {
			count++;
			c = c / 10;
		} while (c != 0);
		return count;
	}
	static int armstrong (int r, int c)
	{
		int f = 1;
		while(c > 0)
		{
			f = f * r;
			c--;
		}
		return f;
	}
	/*
	 * the armstrong method is finished...
	 */
	
	/*
	 * find the sum of deserium number of array..
	 */
	static void deseriumNum(int a[])
	{
		int count = 0;
		int c;
		for(int i = 0; i < a.length; i++)
		{
			int s = 0;
			c = countDig1(a[i]);
			int b = a[i];
			while(b != 0)
			{
				int r = b % 10;
			    s = s + deserium(r,c);
			    c--;
				b = b / 10;
			}
			if(a[i] == s)
				count = count + s;	
		}
		System.out.println("the sum of the deserium number is: " + count);
		System.out.println();
	}
	
	/*
	 * the deserium method is started here...
	 */
	static int countDig1(int c)
	{
		int count = 0;
		do {
			count++;
			c = c / 10;
		} while (c != 0);
		return count;
	}
	static int deserium (int r, int c)
	{
		int f = 1;
		while(c > 0)
		{
			f = f * r;
			c--;
		}
		return f;
	}
	/*
	 * the deserium method is finished...
	 */
	
	/*
	 * find how many palindrome numbers presented in array..
	 */
	static void palindrome(int a[])
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			int  b = a[i];
			int c = a[i], d = 0;
			while(c != 0)
			{
				int r = c % 10;
				d = (d*10) + r;
				c = c / 10;
			}
			if(b == d)
				count++;
		}
		System.out.println("no of palindrome number is: " + count);
	}
}
