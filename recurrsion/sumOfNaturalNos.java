package recurrsion;

import java.util.Scanner;

public class sumOfNaturalNos 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n terms of natural nos: ");
		int n = sum(s.nextInt());
		System.out.println(n);
		s.close();
	}

	static int sum(int n)
	{
		if(n<=1)
			return 1;
		return n+sum(n-1);
	}
	
}
