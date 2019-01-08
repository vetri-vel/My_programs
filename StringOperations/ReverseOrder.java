package StringOperations;

import java.util.Scanner;

public class ReverseOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string  to reverse: ");
		String s = sc.nextLine();
		String c = reverseWords(s);
		System.out.println(c);
		sc.close();
	}
	static String reverseWords(String s)
	{
		char ch[] = s.toCharArray();
		 s = "";
		for(int i = 0; i < ch.length; i++)
		{
			int k = i;
			while(i < ch.length)
				i++;
			int j = i - 1;
			while(j >= k)
			{
				s = s + ch[j];
				j--;
			}
			if(i < ch.length)
				s = s + ch[i];
		}
		return s;
	}
}
