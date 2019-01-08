package StringOperations;

import java.util.Scanner;

public class StringPresentOrNot
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the main string: ");
		String s1 = s.nextLine();
		System.out.println("enter the sub string: ");
		String s2 = s.nextLine();
		boolean rs = checkPresent(s1, s2);
		if(rs)
		{
			System.out.println("the sub string is present: ");
		}
		else
		{
			System.out.println("the sub string is not present: ");
		}
		s.close();
	}
	static boolean checkPresent(String s1, String s2)
	{
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int i = 0, j = 0;
		while(i < c1.length)
		{
			int k = i;
			j = 0;
			while(k < c1.length && j < c2.length && c1[k] == c2[j])
			{
				k++;
				j++;
			}
			if(j == c2.length)
				return true;
			i++;
		}
		return false;
	}
}
