package StringOperations;

import java.util.Scanner;

public class OccuranceOnlyAlpha 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string to count occurance: ");
		String st = s.nextLine();
		int count[] = new int[128];
		for(int i = 0; i < st.length(); i++)
		{
			char ch = st.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				count[ch-65]++;
			}
			else if( ch >= 'a' && ch <= 'z')
			{
				count[ch-97]++;
			}
		}
		for(int i = 0; i < count.length; i++)
		{
			if(count[i] != 0)
				System.out.println((char)i-97+ "--->" + count[i]);
		}
		s.close();
	}
}
