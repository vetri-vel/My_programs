package basicPrograms;
import java.util.Scanner;
public class fizzBuzz 
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = s.nextInt();
		if (n % 4 == 0 && n % 7 == 0)
			System.out.println("Fizz and Buzz");
		else if(n % 4 == 0)
			System.out.println("Fizz");
		else if(n % 7 == 0)
			System.out.println("Buzz");
		else 
			System.out.println("noooooooo");
		s.close();
	}

}
