package basicPrograms;
import java.util.Scanner;
public class LeastAngle {
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the time to check the least time:");
		int hr = sc.nextInt();
		int min = sc.nextInt();
		double hangle = hr * 30 + min * 0.5;
		double mangle = min * 6;
		double angle;
		if (mangle>hangle)
			angle = mangle-hangle;
		else
			angle = hangle-mangle;
		
		if (angle>180)
			angle = 360-angle;
		
		System.out.println("the least angle is: " + angle);
		sc.close();
				
	}

}
