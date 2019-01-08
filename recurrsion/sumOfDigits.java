package recurrsion;

import java.util.Scanner;

public class sumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the nos:");
		long n = sumOfDig(s.nextLong());
		s.close();
		System.out.println(n);
	}
	static long sumOfDig(long n)
	{
		if(n == 0)
			return 0;
		return n % 10 + sumOfDig(n/10);
	}
}
