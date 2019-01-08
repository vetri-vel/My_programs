package specialNumbers;
import java.util.Scanner;
public class StrongNum 
{
	public static void main(String[]a )
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter to check the number..: ");
		int n = s.nextInt();
		boolean m = isStrong(n);
		
		if(m)
			System.out.println("this numbers is strong number");
		else
			System.out.println("this number is not the strong number");
		
		s.close();
	}
	static boolean isStrong(int n)
	{
		int sum = 0;
		int t = n;
		while(n !=  0)
		{
			int r = n % 10;
			sum = sum + fact(r);
			n= n /10;
		}
		return sum==t;
	}
	static int fact(int r)
	{
		int f = 1;
		while(r > 1)
		{
			f = f * r;
			r--;
		}
		return f;
	}
	
}
