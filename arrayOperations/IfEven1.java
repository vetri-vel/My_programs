package arrayOperations;
public class IfEven1 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int a[] = {1,2,3,4,5,6,7,8,8};
		
		for (int i = 0; i < a.length; i++) 
		{
			if(i%2 == 0)
				sum = sum + a[i];
		}
		System.out.println(sum);
		if(sum % 2 == 0)
		{
			for (int i = 0; i < a.length; i++) 
			{
				a[i] = 1;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);;
		}
	}
}
