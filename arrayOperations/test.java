package arrayOperations;

public class test
{
	public static void main(String[] args) 
	{
		
		int c;
		for(int i = 0; i<1000 ; i++)
		{
			int s = 0;
			c = countDig(i);
			int b = i;
			while(b != 0)
			{
				int r = b % 10;
			    s = s + armstrong(r,c);
				b = b / 10;
			}
			if(i == s)
				System.out.println(s);	
		}
	}
	
	static int countDig(int c)
	{
		int count = 0;
		do {
			count++;
			c = c / 10;
		} while (c != 0);
		return count;
	}
	static int armstrong (int r, int c)
	{
		int f = 1;
		while(c > 0)
		{
			f = f * r;
			c--;
		}
		return f;
	}
}
