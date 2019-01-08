package patternsORseries;
import java.util.Scanner;
public class printSeries 
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of terms..:");
		System.out.println("enter the no of terms..:");
		int n = s.nextInt();
		int m = s.nextInt();
		
		/*the first series..*/
		int b = 0;
		for(int i = 0; i <= n; i++)
		{
			b = b + 2;
			if ( b % 4 == 0)
				System.out.print("-" + b + " ");
			else
				System.out.print(b + " ");
		}
		System.out.println(" ");
		/*the second series..*/
		int c = 1;
		for(int i= 0; i <= m; i++)
		{
			if (i % 2 == 0)
				System.out.print(c + " ");
			else
				System.out.print(-c + " ");
			c = c + 2;
		}
		
		/*print the third series..*/
		String e = " ";
		for(int i = 1; i <= n; i++)
		{
			e = e + i;
			System.out.println(e);
		}
		
		/* ..orrr..*/
		s.close();
	}
}
