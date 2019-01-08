package patternsORseries;
import java.util.Scanner;

public class TrickySeries 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you want..:");
		int n = s.nextInt();
		
		
		/*print the series like the following pattern..
		 * 
		 *        *
		 *      * * *
		 *    * * * * *
		 *      * * *
		 *        *
		 */
		
		int sp = n / 2, st = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sp; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= st; j++)
			{
				System.out.print("*");
			}
			if( i <= n / 2)
			{
				sp--;
				st = st +  2;
			}
			else
			{
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
				
		System.out.println();
		System.out.println();
		
		
		
		/*print the series like the following pattern..
		 * 
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 */
		
		int sps = 0, sts = n;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sps; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= sts; j++)
			{
				System.out.print("*");
			}
			if( i <= n / 2)
			{
				sps++;
				sts = sts -  2;
			}
			else
			{
				sps--;
				sts = sts + 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		/*print the series like following pattern..
		 * 
		 *            *
		 *           * *
		 *          *   *
		 *         *     *
		 *          *   *
		 *           * *
		 *            *
		 */
		
		int spac = n / 2, star = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= spac; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++)
			{
				if(j == 1 || j == star)
				
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			if( i <= n / 2)
			{
				spac--;
				star = star +  2;
			}
			else
			{
				spac++;
				star = star - 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		/*print the number series.
		 * 
		 *     1
              333
             55555
            7777777
             55555
              333
               1
		 */
		
		int spa = n / 2, ele = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= spa; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele; j++)
			{
				System.out.print(ele);
			}
			if( i <= n / 2)
			{
				spa--;
				ele = ele +  2;
			}
			else
			{
				spa++;
				ele = ele - 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*print the number series.
		 * 
		 *     1
              123
             12345
            1234567
             54321
              321
               1
		 */
		
		int space = n / 2, el = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= el; j++)
			{
				if( i <= n / 2 + 1)
					System.out.print(j);
				else
					System.out.print(el - j + 1);
			}
			if( i <= n / 2)
			{
				space--;
				el = el +  2;
			}
			else
			{
				space++;
				el = el - 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		/*print the number series.
		 *   
		 *      1
		 *     101
		 *    10101
		 *   1010101
		 *    10101
		 *     101
		 *      1 
		 */
		
		
		int sp1 = n / 2, ele1 = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sp1; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele1; j++)
			{
				System.out.print(j%2);
			}
			if( i <= n / 2)
			{
				sp1--;
				ele1 = ele1 +  2;
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
		
		
		/* print the series like the following pattern..
		 * 
		 *          1
		 *         010
		 *        10101
		 *       0101010
		 *        10101
		 *         010
		 *          1
		 */
		
		
		int spa2 = n / 2, ele2 = 1,k = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= spa2; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele2; j++)
			{
				System.out.print(k%2);
				k++;
			}
			if( i <= n / 2)
			{
				spa2--;
				ele2 = ele2 +  2;
			}
			else
			{
				spa2++;
				ele2 = ele2 - 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		/*print the series like following pattern...
		 * 
		 *         1
		 *        1*2
		 *       1*2*3
		 *      1*2*3*4
		 *     1*2*3*4*5
		 */
		
		for(int i = 1;  i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j <= i; j++)
			{
				System.out.print(j);
				if(j<i)
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		/* print the series like the following pattern..
		 * 
		 * 		1
		 *     234
		 *    56789
		 *   1234567
		 *    89123
		 *     456
		 *      7
		 */
		
		int spa3 = n / 2, ele3 = 1, a = 1 ;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= spa3; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= ele3; j++)
			{
				System.out.print(a);
				a++;
				if(a == 10)
					a = 1;
			}
			if( i <= n / 2)
			{
				spa3--;
				ele3 = ele3 +  2;
			}
			else
			{
				spa3++;
				ele3 = ele3 - 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 * 
		 */
		
		
		
		int sps1 = 0, sts1 = n;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sps1; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= sts1; j++)
			{
				System.out.print(j);
			}
			if( i <= n / 2)
			{
				sps1++;
				sts1 = sts1 -  2;
			}
			else
			{
				sps1--;
				sts1 = sts1 + 2;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		s.close();
	}
}
