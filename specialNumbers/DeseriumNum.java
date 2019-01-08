package specialNumbers;
import java.util.Scanner;
public class DeseriumNum
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check the deserium number..:");
		int n = s.nextInt();
		
		boolean m  = isDesNum(n);
		
		if(m)
			System.out.println("this number is the deserium number..");
		else
			System.out.println("this number is not the deserium number..");
		
		s.close();
	}
	static boolean isDesNum(int n)
	{
		int sum = 0, t = n;
		int dc = countDig(n);
		while(n!= 0)
		{
			int r = n % 10;
			sum = sum + pow(r,dc);
			dc--;
			n = n / 10;
		}
		return sum == t;
	}
	static int countDig(int n)
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
			dc--;
		}
		return f;
	}
}
