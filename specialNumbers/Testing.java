package specialNumbers;
import java.util.Scanner;
public class Testing
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number the lower limit..: ");
		System.out.println("enter the number the upper limit..: ");
		int n = s.nextInt();
		int m = s.nextInt();
		
		s.close();
			
		for(int i = n;i <= m;i++)
		{
			boolean k = ArmStrong(i);
			if(k)
				System.out.println(k + ",");
			
		}
	}
	static boolean ArmStrong(int i)
	{
			int sum = 0, t = i, n = i;
			int dc = countDigit(n);
			while(n > 0)
			{
				int r = n % 10;
				sum = sum + pow(r,dc);
				i = n / 10;
			}
			if (sum == t)
				return true;
			else
				return false;
	}
	static int countDigit(int n)
	{
		int count = 0;
		while(n != 0)
		{
			count ++;
			n = n / 10;
		}
		return count;
	}
	static int pow(int r, int dc)
	{
		int f = 1;
		while(dc > 0)
		{
			f = f * r;
			
		}
		return f;
	}
	
}
