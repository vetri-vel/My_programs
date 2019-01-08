package arrayOperations;

/*
 * get the input from user and check it if its present in this array or not
 */
import java.util.Scanner;

public class CheckPresentNot 
{
	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the no to be check: ");
		int n = s.nextInt();
		
		s.close();
		
		int a[] = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 1456, 2265, 1457, 2456};
		
		if(checking(a, n))
		{
			System.out.println();
			System.out.println("yes it " + n + " is presented in this array in this location: ");
		}
		else
		{
			System.out.println("oops!  this number is not present in this array.:");
		}
	}
	
	static boolean checking (int a[], int n)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == n)
			{
				System.out.println("in " + i + " a[] array index");
				return true;
			}
		}
		return false;
	}
}
