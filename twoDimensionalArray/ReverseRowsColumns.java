package twoDimensionalArray;
public class ReverseRowsColumns
{
	public static void main(String[] args) 
	{
		int t = 0;
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length/2; j++) 
			{
				t = a[i][j];
				a[i][j] = a[i][a[i].length-1-j]; 
				a[i][a[i].length-1-j] = t;
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < b.length/2; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				t = b[i][j];
				b[i][j] = b[b.length-1-i][j];
				b[b.length-1-i][j] = t;
			}
		}
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++) 
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
