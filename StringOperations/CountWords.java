package StringOperations;

import java.util.Scanner;

public class CountWords 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string: ");
		String c = s.nextLine();
		
		char ch[] = c.toCharArray();
		int count = 0;
		for(int i = 0; i < ch.length; i++)
		{
			if(i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
				count++;
		}
		System.out.println("the words counting is: " + count);
		s.close();
	}
}
