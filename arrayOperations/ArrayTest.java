package arrayOperations;
public class ArrayTest 
{
	public static void main(String[] a)
	{
		int pin[] = {606601, 606602, 606603, 606604, 606605, 606606};
		
		int li = pin.length - 1;
		int fi = pin.length;
		
		System.out.println("pin code retrieve in forward direction.: ");
		for(int i = 0; i < fi; i++)
		{
			int f = pin[i];
			System.out.print(f + " ");
			
		}
		System.out.println(" ");
		
		System.out.println("pin code retrieve in backword direction.: ");
		
		for(int i = li; i >= 0; i--)
		{
			int g = pin[i];
			System.out.print(g + " ");
		}
	}
}
