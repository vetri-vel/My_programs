package basicPrograms;
/*program for convert number to decimal..*/
import java.util.Scanner;
public class ConHex {
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
				int r = n%16;
				if (r>9)
					bin = r + bin;
				else if(r==10)
					bin = 'a' + bin;
				else if(r==11)
					bin = 'b' + bin;
				else if(r==12)
					bin = 'c' + bin;
				else if(r==13)
					bin = 'd' + bin;
				else if(r==14)
					bin =  'e'+ bin;
				else if(r==15)
					bin = 'f' + bin;
	     		n = n/16;
			}
			
			return bin;
		}
	

}
