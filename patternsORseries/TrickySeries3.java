package patternsORseries;
import java.util.Scanner;

public class TrickySeries3 
{	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of terms..: ");
		int n = s.nextInt();
		
		s.close();
		
		
		/*
		 * print the series like the following pattern..
		 * 
		 *   1111112
		 *   3222222
		 *   3333334
		 *   5444444
		 *   5555556
		 ** */
		
		for(int i = 1; i <= n; i++)
		{
			if(i% 2 == 0)
				System.out.print(i + 1 + " ");
			for(int j = 1; j <= n; j++)
			{
				System.out.print(i + " ");
			}
			if(i % 2 == 1)
				System.out.print(i + 1 + " ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following..
		 * n = 6;
		 *   3
		 *   44
		 *   555
		 *   555
		 *   44
		 *   3
		 */
		
		
		int ele = 1;
		for(int i =  1; i <= n; i++)
		{
			for(int j = 1; j <= ele; j++)
			{
				System.out.print(n / 2 + ele - 1 + " ");
			}
			if(i < n / 2)
				ele++;
			else if(i > n / 2)
				ele --;
		System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern..
		 *        1
		 *       121
		 *      12321
		 *     1234321
		 *    123454321
		 *     1234321
		 *      12321
		 *       121
		 *        1
		 *
		*/
		
		int sp = n / 2, ele1 = 1;
		for(int i = 1; i <= n;i++)
		{
			for(int j = 1; j <= sp; j++)
			{
				System.out.print(" ");
			}
			int k = 1;
			for(int j = 1; j <= ele1; j++)
			{
				System.out.print(k);
				if(j <= ele1/2)
					k++;
				else
					k--;
			}
			if(i <= n / 2)
			{
				sp--;
				ele1 = ele1 + 2;
			}
			else
			{
				sp++;
				ele1 = ele1 - 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like following pattern..
		 *          1
		 *         212
		 *        32123
		 *       4321234
		 *        32123
		 *         212
		 *          1
		 **/
		
		
		int sp1 = n / 2, ele2 = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sp1;j++)
			{
				System.out.print(" ");
			}
			int a = ele2 / 2 + 1;
			for(int j = 1; j <= ele2; j++)
			{
				System.out.print(a);
				if(j <= ele2/2)
					a--;
				else
					a++;
			}
			if(i <= n/2)
			{
				sp1--;
				ele2 = ele2 + 2;
			}
			else
			{
				sp1++;
				ele2 = ele2 - 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * same with little bit difference.
		 *        1
		 *       212
		 *      32123
		 *     4321234
		 */
		
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i;j++)
			{
				System.out.print(" ");
			}
			int a = i;
			for(int j = 1; j <= (2*i-1); j++)
			{
				System.out.print(a);
				if(j <= (2*i-1)/2)
					a--;
				else
					a++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		/*
		 * print series like the following pattern..
		 *          1
		 *         1*2
		 *        1*2*3
		 *       1*2*3*4
		 *        1*2*3
		 *         1*2
		 *          1
		 */
		
		
		int sp2 = n / 2, ele3 = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sp2;j++)
			{
				System.out.print(" ");
			}
			int a = 1; 
			for(int j = 1; j <= ele3; j++)
			{
				if(j % 2 == 0)
					System.out.print("*");
				else
					System.out.print(a++);
			}
			if(i <= n/2)
			{
				sp2--;
				ele3 = ele3 + 2;
			}
			else
			{
				sp2++;
				ele3 = ele3 - 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		/*
		 * print the series like the following pattern..
		 *   1
		 *   2  3
		 *   6  5  4
		 *   7  8  9  10
		 *   15 14 13 12  11
		 *   16 17 18 19  20  21
		 *   28 27 26 25  24  23 22
		 **/
		
		int start = 1;
		for(int i = 1; i <= n; i++)
		{
			int k = start;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(k + " ");
				if(i%2 == 0)
					k++;
				else
					k--;
			}
			if(i%2 == 1)
				start++;
			else
				start = start + (2 * i);
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern..
		 *   1
		 *   3  2
		 *   4  5  6
		 *   10  9  8 7
		 *   11 12 13 14  15
		 *   21 20 19 18  17  16
		 *   22 23 24 25  26  27 28
		 *   36 35 34 33  32  31 30 29
		 **/
		
		int sta = 1;
		for(int i = 1; i <= n; i++)
		{
			int k = sta;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(k + " ");
				if(i%2 == 0)
					k--;
				else
					k++;
			}
			if(i%2 == 1)
				sta = sta + (2*i);
			else
				sta++;
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		

		/*
		 * print the series like the following pattern..
		 *   1  2  3  4  5
		 *   10 9  8  7  6 
		 *   11 12 13 14 15
		 *   20 19 18 17 16
		 *   21 22 23 24 25
		 **/
		
		int sta1 = 1;
		for(int i = 1; i <= n; i++)
		{
			int k = sta1;
			for(int j = 1; j <= n; j++)
			{
				System.out.print(k + " ");
				if(i%2 == 0)
					k--;
				else
					k++;
			}
			if(i%2 == 1)
				sta1 = sta1 + (2*n-1);
			else
				sta1++;
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern..
	 	 *  1  2  3  4  5
	 	 *  11 12 13 14 15
		 *  21 22 23 24 25
		 *  16 17 18 19 20
		 *  6  7  8  9  10
		 
		
		int c = 1;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.println(c);
				c++;
			}
			if(i <= n / 2)
				c = c + 10;
			else if(i == 4)
		}
	  */
		
		/*
		 * print the series like the following pattern,
		 * 1 2 3 4 3 2 1
		 *   1 2 3 2 1
		 *     1 2 1
		 *       1
		 *     1 2 1
		 *   1 2 3 2 1
		 * 1 2 3 4 3 2 1
		 */
		
        int space = 0, ele4 = n;
		
		for(int i = 1; i <= n; i++)
		{
			int k = 1;
			for(int j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele4; j++)
			{
				System.out.print(k);
				if(j <= ele4 / 2)
					k++;
				else
					k--;
			}
			if(i <= n / 2)
			{
				space++;
				ele4 = ele4 - 2;
			}
			else
			{
				space--;
				ele4 = ele4 + 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern,
		 * 4 3 2 1 2 3 4
		 *   3 2 1 2 3
		 *     2 1 2
		 *       1
		 *     2 1 2
		 *   3 2 1 2 3
		 * 4 3 2 1 2 3 4
		 */
		
        int spac = 0, ele5 = n;
		
		for(int i = 1; i <= n; i++)
		{
			int k = ele5 / 2 + 1 ;
			for(int j = 1; j <= spac; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele5; j++)
			{
				System.out.print(k);
				if(j <= ele5 / 2)
					k--;
				else
					k++;
			}
			if(i <= n / 2)
			{
				spac++;
				ele5 = ele5 - 2;
			}
			else
			{
				spac--;
				ele5 = ele5 + 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
