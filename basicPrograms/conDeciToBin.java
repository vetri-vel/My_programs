package basicPrograms;
/*program for convert decimal to binary..*/
import java.util.Scanner;
public class conDeciToBin {
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to convert it:");
		int n = s.nextInt();
		String m = DeciToBin(n);
		System.out.println("the BINARY value is " + m);
		s.close();
	}	
		static String DeciToBin(int n)
		{
			String bin = "";
			
			while(n!=0)
			{
				int r = n%2;
				bin = bin + r;
				n = n/2;
			}
			
			return bin;
		}
	

}
