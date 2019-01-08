package basicPrograms;
import java.util.Scanner;
public class sanjuGeetha 
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = s.nextInt();
		if (n % 3 == 0 && n % 5 == 0)
			System.out.println("Sanju weds Geetha");
		else if(n % 3 == 0)
			System.out.println("Sanju");
		else if(n % 5 == 0)
			System.out.println("Geetha");
		else 
			System.out.println("Break up");
		s.close();
	}

}
