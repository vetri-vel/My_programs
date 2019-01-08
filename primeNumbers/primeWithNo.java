package primeNumbers;
import java.util.Scanner;
public class primeWithNo {

	public static void main (String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit for print and add the prime numbers: ");
		int n = s.nextInt();
	    int count = 0, sum = 0;
		for(int i = 0; i<=n; i++)
		{
			int k = 2;
			while(k<=n/2)
			{
				if(i/k==0)
				{
					
				}
				System.out.print(i + " ");
				count += 1;
				sum += i;
				k++;
			}
		}
		System.out.println("total prime numbers are: " + count);
		System.out.println("sum prime numbers are: " + sum);
		
		s.close();
	}
}
