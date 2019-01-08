package specialNumbers;
import java.util.Scanner;
public class Happynum {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you want check the happy number:");
		int n = s.nextInt();
		int t = n;
		do
			{
				int sum = 0;
				do
				{
					int r = n%10;
					sum = sum+r*r;
					n = n/10;
				}while(n!=0);
			
				n = sum;
			}while(n>9);	
			
		    
		if(n==1 || n==7)
		{
			System.out.println(t+ " is the happy number");
		}
		else
		{
		
			System.out.println(t+ " is the not happy number");
		}
		s.close();
	}
}
