package StringOperations;

import java.util.Scanner;

public class ConvertFirstCaps
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string: ");
		String c = s.nextLine();

		char ch[] = c.toCharArray();
		String newst = "";
		for(int i = 0; i < ch.length; i++)
		{
			if(i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
			{
				if (ch[i] >= 'a' && ch[i] <= 'z')
					ch[i] = (char)(ch[i] - 32);
			}
			else if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char)(ch[i] + 32);
			newst = newst + ch[i];
		}
		System.out.println(newst);
		s.close();
	}
}
