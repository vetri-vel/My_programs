package patternsORseries;
import java.util.Scanner;

public class TrickySeries2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you want the terms...:");
		int n = s.nextInt();
		
		s.close();
		
		/*print the series like the following pattern..
		 * 
		 * 10101
		 * 10101
		 * 10101
		 * 10101
		 * 10101
		 */
		
		for (int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(j % 2);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*print the series like the following pattern..
		 * 
		 *         v
		 *        vet
		 *       verti
		 *        vet
		 *         v
		 * */
		
		int sp = n / 2, ele = 1;
		String st = "VETRI";
		
		for(int i = 1; i <=n; i++)
		{
			for(int j = 1; j <= sp; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < ele; j++)
			{
				System.out.print(st.charAt(j));
			}
			if(i <= n / 2)
			{
				sp--;
				ele = ele + 2;
			}
			else
			{
				sp++;
				ele = ele - 2;
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*print same pattern in different string..
		 * 
		 *     a
		 *    abc
		 *   abcdef
		 *    abc
		 *     a
		 **/
		
		int sp1 = n / 2, ele1 = 1;
		String st1 = "ABCDEF";
		
		for(int i = 1; i <=n; i++)
		{
			for(int j = 1; j <= sp1; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < ele1; j++)
			{
				System.out.print(st1.charAt(j));
			}
			if(i <= n / 2)
			{
				sp1--;
				ele1 = ele1 + 2;
			}
			else
			{
				sp1++;
				ele1 = ele1 - 2;
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		/*print the series like the following pattern...
		 * 
		 *        1
		 *       121
		 *      12321
		 *     1234321
		 *    123454321
		 **/
		
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n - i;j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			for(int j =i - 1; j >= 1;  j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		/*
		 * print the series like the following pattern..
		 * 
		 *          1
		 *         234
		 *        56789
		 *       1234567
		 *        89123
		 *         456
		 *          7
		 */
		
		int a = 1, sp3 = n / 2, el1 = 1;
		for(int i =1; i <= n; i++)
		{
			for(int j = 1; j <= sp3 ; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= el1; j++ )
			{
				System.out.print(a);
				a++;
				if(a == 10)
					a =1;
					
			}
			if( i <= n / 2)
			{
				sp3--;
				el1 = el1 + 2;
			}
			else
			{
				sp3++;
				el1 = el1 - 2;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		/*
		 * print the series like the following pattern..
		 * 
		 *  1
		 *  2 6
		 *  3 7 10
		 *  4 8 11 13
		 *  5 9 12 14 15
		 *  
		 */
		
				
		for(int i = 1; i <= n; i++)
		{
			int b = i;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(b + " ");
				b = b + n - j;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern..
		 *        
		 *        V
		 *        V E 
		 *        V E T
		 *        V E T R
		 *        V E T R I
		 */
		
		String str = "VETRI";
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < i;j++)
			{
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/*
		 * print the series like the following pattern..
		 *  
		 *           Q
		 *          QSP
		 *         QSPID
		 *        QSPIDER
		 *       QSPIDERS
		 *         
		 */
		
		String strr = "QSPIDERS";
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < (2 * i -1); j++)
			{
				if(j == strr.length())
					return;
				System.out.print(strr.charAt(j));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
	}
}
