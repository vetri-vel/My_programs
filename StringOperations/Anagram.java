package StringOperations;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the two strings: ");
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		boolean rs = isAnagram(s1,s2);
		if(rs)
			System.out.println("this is anagram string..");
		else
			System.out.println("this is not an anagram string..");
		s.close();
	}
	static boolean isAnagram(String s1, String s2)
	{
		int c1[] = countOccurence(s1);
		int c2[] = countOccurence(s2);
		for(int i = 0; i < c2.length; i++)
		{
			if(c1[i] != c2[i])
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
			if(ch >= 65 && ch <= 97)
				c[ch-65]++;
			else if(ch >= 98 && ch <= 122)
				c[ch-97]++;
		}
		return c;
	}
	
}
