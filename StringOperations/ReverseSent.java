package StringOperations;

import java.util.Scanner;

public class ReverseSent 
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
		for(int i = ch.length - 1; i >= 0 ; i--)
		{
			int k = i;
			while(i >= 0 && ch[i] != ' ')
				i--;
			int j = i + 1;
			while(j <= k)
			{
				s = s + ch[j];
				j++;
			}
			if(i > 0)
				s = s + ch[i];
		}
		return s;
	}
}
