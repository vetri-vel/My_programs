package twoDimensionalArray;
public class SumDiagonal 
{
	public static void main(String[] args) 
	{
		int psum = 0, ssum = 0;
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(i == j)
					psum = psum + a[i][j];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(i + j == a.length - 1)
					ssum = ssum + a[i][j];
			}
		}
		System.out.println("the primilinary diagonal: " + psum);
		System.out.println("the secondary diagonal: "+ ssum);
	}
}
