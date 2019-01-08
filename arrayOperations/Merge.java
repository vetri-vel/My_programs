package arrayOperations;
import java.util.Scanner;

public class Merge
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		MergeArr ma = new MergeArr();
		System.out.println("read the first array: ");
		int a[] = ma.readArr();
		System.out.println("read the second array: ");
		int  b[] = ma.readArr();
		
		System.out.println("the first array elements are: ");
		ma.dispArr(a);
		System.out.println("the second array elements are: ");
		ma.dispArr(b);
		
		System.out.println("the merged array elements are: ");
		int c[] = ma.mergeArr(a, b);
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + ",");
		}
		s.close();
		
	}
}
