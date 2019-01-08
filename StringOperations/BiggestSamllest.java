package StringOperations;

import java.util.Scanner;

public class BiggestSamllest 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = s.nextLine();
		char ch[] = str.toCharArray();
		
		String a = bigWord(ch);
		System.out.println("the biggest word is: " + a);
		
		String b = smallWord(ch,str);
		System.out.println("the smallest word is: " + b);
		
		s.close();
	}
	static String bigWord(char ch[])
	{
		String bw = "";
		for(int i = 0; i < ch.length; i++)
		{
			String w = "";
			while(i < ch.length && ch[i] != ' ')
			{
				w = w + ch[i];
				i++;
			}
			if(w.length() > bw.length())
			{
				bw = w;
			}
		}
	    return bw;
	}
	static String smallWord(char ch[], String st)
	{
		String sw =st ;
		for(int i = 0; i < ch.length; i++)
		{
			String w = "";
			while(i < ch.length && ch[i] != ' ')
			{
				w = w + ch[i];
				i++;
			}
			if(w.length() < sw.length())
			{
				sw = w;
			}
		}
	    return sw;
	}
}

