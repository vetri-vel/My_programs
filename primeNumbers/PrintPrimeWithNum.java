package primeNumbers;
import java.util.Scanner;

public class PrintPrimeWithNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number of prime.: ");
		System.out.println("enter the digits: ");
		int num = s.nextInt();
		int n = s.nextInt();
		
		int c = countDigit(num);
		
		primePrint(num,n);
		
		s.close();
		
		if(c != n)
		{
			System.out.println("enter the valid number terms: ");
			return;
		}
		
		
		
	}	
	static void primePrint(int num, int n)
	{
		for(int i = num; countDigit(i) == n; i++)
		{
			if(prime(i))
			{
				System.out.println(i + ",");
			}
		}
		
	 }
		
	static int countDigit(int num) 
	{
		int count = 0;
		do {
			num = num / 10;
			count ++;
		} while (num !=  0);
		return count;
	}
	
	static boolean prime(int num)
	{
		int i = 2;
		while(i < num / 2)
		{
			if(num % i == 0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
