package patternsORseries;
import java.util.Scanner;

public class EvaluteSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of term..: ");
		int n = sc.nextInt();
		
		int m = Sumserious(n);
		int o = Sumseri(n);
		int p = evaserious(n);
		int r = evaseri(n);
		System.out.println("the factorial serious evalute reuslt is..: " + m);
		System.out.println("the qupe serious evalute reuslt is..: " + o);
		System.out.println("the even sum serious evalute reuslt is..: " + p);
		System.out.println("the odd sum serious evalute reuslt is..: " + r);
		
		sc.close();
	}
	static int Sumserious(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			if(i == 1 || i % 2 == 0)
				sum = sum + i / fact(i);
			else
				sum = sum - i / fact(i);
		}
		return sum;
	}
	static int fact(int n)
	{
		int f = 1;
		if(n>1)
		{	
			f = f * n;
			n--;
		}
		
		return f;
	}
	static int Sumseri(int n)
	{
		int sum = 0;
		for(int  i= 1; i <= n; i++)
		{
			if(i == 1 || i % 2 == 0)
				sum = sum + 1 / (i*i*i);
			else
				sum = sum - 1 / (i*i*i);
		}
		return sum;
	}
	static int evaserious(int n)
	{
		int sum = 0;
		for(int i = 1; i<= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				sum= sum + j;
			}
		}
		return sum;
	}
	static int evaseri(int n)
	{
		int sum = 0;
		for(int i = 1; i<= n; i++)
		{
			for(int j = 1; j <= (2*i-1); j += 2)
			{
				sum= sum + j;
			}
		}
		return sum;
	}
}
