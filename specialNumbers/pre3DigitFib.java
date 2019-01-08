package specialNumbers;
import java.util.Scanner;
public class pre3DigitFib
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the terms number..:");
		int n = s.nextInt();
		int a1 = 1, b = 2, c = 3,d = 0, sum = 0;
		for(int i = 0; i<= n; i++)
		{
			System.out.print(a1 + " ");
			sum = sum+ a1;
			d = a1 + b + c;
			a1 = b;
			b = c;
			c = d;
		}
		System.out.println(" ");
		System.out.println("the total sum is.: " + sum);
		
		s.close();
	}

}
