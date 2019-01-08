package arrayOperations;

public class Replace 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,4,5,6,7,8};
		int b [] = repalceArr(a);
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		int c[] = replaceEle(a);
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
	
	static int[] repalceArr(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
				a[i] = 0;
			else
				a[i] = 1;
		}
		return a;
	}
	
	/*
	 * the array elements is replaced by the no of array elements..
	 */
	

	static int[] replaceEle(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			a[i] = a.length;
		}
		return a;
	}
	

}
