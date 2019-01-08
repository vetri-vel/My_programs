package recurrsion;

public class sumOfArray 
{
	static int i = 0, j = 0;
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,7,8};
		j = sumArray(a);
		System.out.println(j);
	}
	static int sumArray(int a[])
	{
		if(i<a.length)
		{
			j = j + a[i];
			i++;
			sumArray(a);
		}
		return j;
	}
}
