package gamePrograme;
import java.util.Scanner;
import java.util.Random;
public class diceGameWith100
{
	public static void main(String[] a)
	{
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("enter the first player name: ");
		String fName = s.next();
		System.out.println("enter the second player name: ");
		String sName = s.next();
		int fcount = 0, scount = 0;
		while(true)
		{
			System.out.println(fName + " press the any button to flip the dice..:");
			s.next();
			int fno = r.nextInt(6) + 1;
			System.out.println("your score is: "+ fno);
			if (fcount + fno <= 100)
				fcount = fcount + fno;
			if(fcount == 100)
			{
				System.out.println(fName + " won the game..");
				break;
			}
			System.out.println("total score is " + fcount);
		System.out.println("........................................");
		System.out.println(sName + " press the any button to flip the dice..:");
			s.next();
			int sno = r.nextInt(6) + 1;
			System.out.println("your score is: "+ sno);
			if (scount + sno <= 100)
				scount = scount + sno;
			if(fcount == 100)
			{
				System.out.println(sName + " won the game..");
				break;
			}
			System.out.println("total score is " + scount);
		System.out.println("........................................");
		s.close();
		}
	}

}
