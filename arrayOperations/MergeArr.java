package arrayOperations;
import java.util.Scanner;

public class MergeArr 
{
	Scanner s = new Scanner(System.in);
	int[] readArr() 
	{
		System.out.println("enter the array size: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("now enter the " + n + " elements");
		for(int i = 0; i < n; i++)
		{
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	
	
     void dispArr(int ar[])
	{
    	System.out.print("the elements which you are gave: ");
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + ",");
		}
		System.out.println();
	}
	
	int[] mergeArr(int a[], int b[])
	{
		int []z = new int[a.length + b.length];
		
		for(int i = 0; i < z.length; i++)
		{
			if(i < a.length)
			{
				z[i] = a[i];
			}
			if(i < b.length)
			{
				z[a.length + i] = b[i];
			}
		}
		return z;
	}
	
	
}
