package StringOperations;

import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) 
	{
		Scanner s = new  Scanner(System.in);
		System.out.println("enter the string to performing sorting: ");
		String str  = s.nextLine();
		
		String a = sortingBasedWordLength(str);
		System.out.println("after sorting based on the length of word the sentence: ");
		System.out.println(a);
		System.out.println();
		
		String b = sortingBasedAlpha(str);
		System.out.println("after sorting based on alphabetic the sentence is: ");
		System.out.println(b);
		s.close();
	}
	static String sortingBasedWordLength(String str)
	{
		String word[]  = str.split(" ");
		String st = " ";
		for(int i = 0; i < word.length; i++)
		{
			for(int j = i+1; j < word.length; j++)
			{
				if(word[j].length() < word[i].length())
				{
					String t = word[i];
					word[i] = word[j];
					word[j] = t;
				}
			}
			st = st + word[i] + " ";
		}
		return st;
	}
	static String sortingBasedAlpha(String str)
	{
		String word[]  = str.split(" ");
		String st = " ";
		for(int i = 0; i < word.length; i++)
		{
			for(int j = i+1; j < word.length; j++)
			{
				if(word[j].compareTo(word[i]) < -1)
				{
					String t = word[i];
					word[i] = word[j];
					word[j] = t;
				}
			}
			st = st + word[i] + " ";
		}
		return st;
	}
}
