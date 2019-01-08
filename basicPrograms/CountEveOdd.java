package basicPrograms;
import java.util.Scanner;
public class CountEveOdd
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		int ecount = 0, ocount = 0;
		while(n != 0)
		{
			int r = n % 10;
			if (r % 2 == 0)
				ecount ++;
			else
				ocount ++;
			n = n/ 10;
		}
		System.out.println("this number had even numbers are..: " + ecount);
		System.out.println("this number had odd numbers are..: " + ocount);
		s.close();
	}
}
