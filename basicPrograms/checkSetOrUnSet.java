package basicPrograms;
import java.util.Scanner;
public class checkSetOrUnSet {
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check the bits: ");
		int n = s.nextInt();
		CheckSetOrUnSet(n);
		s.close();
	}
	static void CheckSetOrUnSet(int n)
	{
		int count1 = 0, count2 = 0;
		while(n != 0)
		{		
			if (n%2==0)
				count1 += 1;
			else
				count2++;
		    n = n/2;
		}
	System.out.println("the setteled bits are: " + count2);
	System.out.println("the unsetteled bits are: " + count1);
	}

}
