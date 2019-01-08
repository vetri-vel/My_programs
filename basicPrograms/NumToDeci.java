package basicPrograms;
/*program for convert number to decimal..*/
import java.util.Scanner;
public class NumToDeci {
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
				int r = n%10;
				bin = r + bin;
				n = n/10;
			}
			
			return bin;
		}
	

}
