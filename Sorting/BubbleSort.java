package Sorting;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[] = {23,56,38,45,78,13,59,13};
		int d[] = {23,56,38,45,78,13,59};
		int b[] = bubbleDown(a);
		display(b);
		int c[] = bubbleUp(d);
		display(c);
	}
	static int[] bubbleDown(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) 
			{
				if(a[i] > a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}
	
	static int[] bubbleUp(int d[])
	{
		for(int i = 0; i < d.length; i++)
		{
			for (int j = 0; j < d.length-1-i; j++) 
			{
				if(d[j] > d[j+1])
				{
					int t = d[j];
					d[j] = d[j+1];
					d[j+1] = t;
				}
			}
		}
		return d;
	}
	static void display(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}		
		System.out.println();
		System.out.println();
	}
}
