package specialNumbers;
import java.util.Scanner;
public class ArmstrongNum
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check..: ");
		int n = s.nextInt();
		
		boolean m = isArm(n);
		if(m)
			System.out.println("this number is the Arm Strong number.. ");
		else
			System.out.println("this number is not the ArmString nummber..");
		
		s.close();
	}
	static boolean isArm(int n)
	{
		int sum = 0, t = n;
		int dc = countDigit(n);
		while(n != 0)
		{
			int r = n % 10;
			sum = sum + pow(r,dc);
			n = n / 10;
		}
		return sum == t;
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
			dc--;
		}
		return f;
	}
	
}
