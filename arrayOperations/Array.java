package arrayOperations;
import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the weight of the 8 person: ");
		double weight[] = new double[8];
		
		for(int i = 0; i<8; i++)
		{
			weight[i] = s.nextDouble();
		}
		double sum = 0;
		for(int i = 0; i<8; i++)
		{
			System.out.println(i+1 + " person weight is  " + weight[i]);
			sum = sum + weight[i];
		}
		System.out.println(sum);
		System.out.println();
		System.out.println("the average weight of 8 person weight is: " + sum/8);
		s.close();
	}
}
