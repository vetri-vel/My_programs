package Sorting;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int a[] = {23,56,38,45,78,13,59};
		int b[] = selectionSort(a);
		for(Object o:b)
		{
			System.out.print(o+",");
		}
	}
	static int[] selectionSort(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int k = i;
			for (int j =i + 1; j < a.length; j++) 
			{
				if(a[k] > a[j])
				{
					k = j;
				}
			}
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
		return a;
	}
}
