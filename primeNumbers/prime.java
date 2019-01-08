package primeNumbers;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number...: ");
		int n = s.nextInt();
		
		boolean m = isPrime(n);
		
		if(m)
			System.out.println("this number is the prime number..");
		else
			System.out.println("this number is not prime number..");
		
		s.close();
	}
	static boolean isPrime(int n)
	{
		int k = 2;
		while (k <= n/2)
		{
			if(n%k == 0)
				return false;
		    k++;
		}
		return true;
			
	}
	
		
	

}
