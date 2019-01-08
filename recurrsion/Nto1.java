package recurrsion;

import java.util.Scanner;

public class Nto1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		print(s.nextInt());
		s.close();
	}
	static void print(int n)
	{
		System.out.println(n);
		if(n>1)
			print(n-1);
	}
}
