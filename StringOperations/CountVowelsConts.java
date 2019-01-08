package StringOperations;

import java.util.Scanner;

public class CountVowelsConts 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string: ");
		String st = s.nextLine();
		
		int vow = 0,cons = 0;
		char ch[] = st.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'a' || ch[i] <= 'z' ||ch[i] >= 'A' || ch[i] <= 'Z')
			{
				if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				{
					vow++;
				}
				else if(ch[i] >= 'a' && ch[i] <= 'z')
				{
					cons++;
				}
			}
		}
		
		System.out.println("the vowles is: " + vow);
		System.out.println("the consonants is: " + cons);
		s.close();
	}
}
