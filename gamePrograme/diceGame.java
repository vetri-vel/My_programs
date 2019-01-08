package gamePrograme;
import java.util.Scanner;
import java.util.Random;
public class diceGame
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("enter the first player name:");
		String fName = s.next();
		System.out.println("enter the second player name:");
		String sName = s.next();
		int fcount = 0, scount = 0;
		System.out.println(fName + " press any button to flip the dice:");
		s.next();
		fcount = r.nextInt(6) + 1;
		System.out.println(sName + " press any button to flip the dice: ");
		s.next();
		scount = r.nextInt(6) + 1;
		if (fcount > scount)
			System.out.println(fName + " won the game..");
		else if (scount > fcount)
			System.out.println(sName + " won the game..");
		else
		
			System.out.println("match is draw..");
		System.out.println("the score is..:");
		System.out.println("score of " + fName + " is " + fcount);
		System.out.println("score of " + sName + " is " + scount);
		
		s.close();
		
	}
}
