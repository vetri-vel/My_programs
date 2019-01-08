package recurrsion;

import java.util.Scanner;

public class factorialOfN 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no: ");
		int n = fact(s.nextInt());
		System.out.println(n);
		s.close();
	}
	static int fact(int n)
	{
		if(n == 0|| n == 1)
			return 1;
		return n*fact(n-1);
	}
}
