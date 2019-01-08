package patternsORseries;
import java.util.Scanner;

public class TrickySeries4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you want: ");
		int n = s.nextInt();
		
		/*
		 * print the series like the following pattern..
		 * 
		 *  1 * 2 * 3 * 4 * 17 * 18 * 19 * 20
		 *      5 * 6 * 7 * 14 * 15 * 16
		 *          8 * 9 * 12 * 13
		 *          10* 11
		 */
		
		int sp = 0, ele = n * 2, k = 1, q = n * n + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sp; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele; j++)
			{
				if(j <= ele / 2)
				{
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print(q);
					q++;
				}
			
				if (j < ele)
					System.out.print("*");
			}
			q = q - (ele - 1);
			sp = sp + 2;
			ele = ele - 2;
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern...
		 *     1  2  3  4  5
		 *     11 12 13 14 15
		 *     21 22 23 24 25
		 *     16 15 14 13 12
		 *     6  7  8  9  10
		 **/
		
		
		int a = 1, half = 0;
		if(n % 2 == 1)
			half = n/ 2 + 1;
		else
			half = n / 2;
		for(int i = 1; i <= n; i++)
		{
			int b = a;
			for(int j = 1; j <= n; j++)
			{
				System.out.print(b);
				b++;
			}
			if(i < half)
				a = a + n * 2;
			if(i == half)
			{
				if(n % 2 == 1)
					a = a - n;
				else
					a = a + n;
			}
			if(i > half)
				a = a - n * 2;
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		/*
		 * print the series like the following pattern..
		 *   *****
		 *   ** **
		 *   * * *
		 *   ** **
		 *   *****
		 **/
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n || i == j || i+j == n + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern..
		 *  *    *
		 *   *  *
		 *    *
		 *   *  *
		 *  *    *
		 */
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == j || i+j == n +1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern..
		 *  *****
		 *   * *
		 *    *
		 *   * * 
		 *  *****
		 */
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || i == j || i+j == n +1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern..
		 * 
		 */
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j == 1 || j == n || i == j || i+j == n +1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
			
		/*
		 * print the series like the following pattern.
		 */
		int center = 0;
		if(n%2 == 0)
			center = n/2;
		else
			center = n/2 + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == j || i+j == n + 1 || i == center || j == center)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern..
		 * 
		 */
		int center1 = 0;
		if(n%2 == 0)
			center1 = n/2;
		else
			center1 = n/2 + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n ||i == center1 || j ==  center1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern.
		 */
		
		int center2 = 0;
		if(n%2 == 0)
			center2 = n/2;
		else
			center2 = n/2 + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j == 1 || j == n ||(i == j || i+j == n+1) && i <= center2) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		/*
		 * print the series like the following pattern.
		 */
		
		int center3 = 0;
		if(n%2 == 0)
			center3 = n/2;
		else
			center3 = n/2 + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j == 1 || j == n ||(i == j || i+j == n+1) && i >= center3) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern.
		 */
		
		int center4 = 0;
		if(n%2 == 0)
			center4 = n/2;
		else
			center4 = n/2 + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(j == center4 ||(i == j || i+j == n+1) && i <= center4) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern.
		 */
		
		int center5 = 0;
		if(n%2 == 0)
			center5 = n/2;
		else
			center5 = n/2 + 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i+j == n+1 ||(i == j) && i <= center5) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern..
		 */
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 ||i == n || i+j == n+1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
	s.close();	
	} 
	
	

}
