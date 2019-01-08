package StringOperations;

import java.util.Scanner;

public class ReplaceSpaceWithCount 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = s.nextLine();
		char ch[] = str.toCharArray();
		str = "";
		for(int i = 0; i < ch.length; i++)
		{
			String w = "";
			int count = 0;
			while(i < ch.length && ch[i] != ' ')
			{
				count++;
				str = str + ch[i];
				w = w + ch[i];
				i++;
			}
			if(count != 0)
			{
				str = str + count;
				System.out.println(w + "--->" + count);
			}
			System.out.println();
		}
		System.out.println(str);
		s.close();
	}
}
