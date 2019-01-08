package twoDimensionalArray;
public class BigAndSmall 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int b = biggest(a);
		System.out.println("the biggest number is: " + b);
		
		int c = smallest(a);
		System.out.println("the smallest number is:" + c);
	}
	
	static int biggest(int a[][])
	{
		int b = a[0][0];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(b > a[i][j])
					b = a[i][j];
			}
		}
		return b;
	}
	
	static int smallest(int a[][])
	{
		int b = a[0][0];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(b < a[i][j])
					b = a[i][j];
			}
		}
		return b;
	}
}
