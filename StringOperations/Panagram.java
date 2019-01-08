package StringOperations;

import java.util.Scanner;

public class Panagram 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the strings: ");
		String s1 = s.nextLine();
		boolean rs = isAnagram(s1);
		if(rs)
			System.out.println("this is panagram string..");
		else
			System.out.println("this is not an panagram string..");
		s.close();
	}
	static boolean isAnagram(String s1)
	{
		int c1[] = countOccurence(s1);
		for(int i = 0; i < c1.length; i++)
		{
			if(c1[i] == 0)
				return false;	
		}
		return true;
	}
	static int[] countOccurence(String s)
	{
		int c[] = new int[26];
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				c[ch-65]++;
			else if(ch >= 'a' && ch <= 'z')
				c[ch-97]++;
		}
		return c;
	}
	
}
