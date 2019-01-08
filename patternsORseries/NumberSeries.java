package patternsORseries;
import java.util.Scanner;

public class NumberSeries 
{
	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		System.out.println("enter the number..: ");
		int n = t.nextInt();
		
	    /* print the series like following pattern..
	     * 
	     * 1
	     * 2 3
	     * 4 5 6
	     * 7 8 9 1
	     * 2 3 4 5 6 
	     */
		int k = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <=i ;j++)
			{
				System.out.print(k + " ");
				k++;
				if( k == 10)
					k = 1;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/* print the series like following pattern..
		 * 
		 * 1
		 * 1 0 
		 * 1 0 1
		 * 1 0 1 0
		 * 1 0 1 0 1
		 *
		 */
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i ; j++)
			{
				System.out.print( j % 2 + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/* print the series like following pattern..
		 * 
		 *     1
		 *   1 0 1
		 * 1 0 1 0 1
		 *  
		 */
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (2 * i - 1); j++)
			{
				System.out.print(j%2 + "");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/* print the series like following pattern..
		 * 
		 * 1
		 * 0 1
		 * 0 1 0
		 * 1 0 1 0
		 * 1 0 1 0 1
		 */
		int a = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(a % 2 + " ");
				a++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/* print the series like following pattern..
		 * 
		 * R
		 * R A
		 * R A G
		 * R A G H
		 * R A G H U
		 * 
		 */
		String string  = "RAGHU";
	    for(int i = 1; i <= string.length(); i++)
	    {
	    	for(int j = 0; j<i; j++ )
	    	{
	    		System.out.print(string.charAt(j) + " ");
	    	}
	    	System.out.println();
	    }
	    t.close();
		
	}
}
