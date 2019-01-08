package patternsORseries;
import java.util.Scanner;
public class printSquarSeri 
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of terms..:");
		int n = s.nextInt();
		int i = 0, sum = 0;
		while(i <= n)
		{
			System.out.print(i * i);
			sum = sum + (i * i);
			if(i<n)
				System.out.print(",");
			i++;
		}
		System.out.println();
		System.out.println("the total sum value is..: " + sum);
		s.close();
	}

}
