package recurrsion;

import java.util.Scanner;

public class test 
{
	static int i = 2;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no: ");
		boolean res = isPrime(s.nextInt());
		System.out.println(res);
		s.close();
	}
	static boolean isPrime(int n)
	{
		if(i>n/2)
		{
			if(n % i == 0)
				return false;
			i++;
		}
		return isPrime(n);
	}
}

