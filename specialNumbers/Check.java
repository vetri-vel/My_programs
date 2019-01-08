package specialNumbers;
import java.util.Scanner;
public class Check {

	public static void main(String[] a)
	{
		Scanner s =  new Scanner(System.in);
		System.out.println("enter the number you want check: ");
		int n = s.nextInt();
		boolean m = checkIfFib(n);
		if (m)
			System.out.println(n + " is a not fibbonacci number");
		else
			System.out.println(n + " is  a fibbonacci number");
		System.out.println("--------------------------------------");
	 	System.out.println("the n term numbers are");
	 	nTermFib(n);
	 	int q = nthFib(n);
		System.out.println("the " + n + "th fibbonacci  number is" + q);
	 	System.out.println("--------------------------------------");
	 	System.out.println("the fibbonacci numbers with n are...");
        withInNFib(n);
        
        
        s.close();
		
	}

	static boolean checkIfFib(int n)
	{
		int f1=0,f2=1,f3;
		while(f1>=n)
		{
			if(f1==n)
				return true;
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
    return  false;
	}
	static void nTermFib(int n)
	{
		int f1=0,f2=1,f3;
		while(n>0)
		{
			System.out.print(f1 + ",");
			f3 = f1 +f2;
			f1 = f2;
			f2 = f3;
			n--;
		}
	}
	static void withInNFib(int n)
	{
		int f1=0,f2=1,f3;
		while(f1<=n)
		{
			System.out.print(f1 + ",");
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
	}
	static int nthFib(int n)
	{
		int f1=0,f2=1,f3;
		while(n>1)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			n--;
		}
	return f1;			
	}	
}
