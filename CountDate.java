import java.sql.Date;
import java.util.Scanner;

import basicPrograms.sanjuGeetha;

public class CountDate 
{
	int dd, mm, yy;
	int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

	public CountDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		if(yy %400 == 0 || yy % 4 == 0 && yy % 100 != 0)
			month[2] = 29;
	}
	
	@Override
	public String toString() {
		return dd + "/" + mm + "/" + yy;				
	}
	
	int countDays()
	{
		int days = dd;
		for(int i = 1; i<mm; i++)
		{
			days = days + month[i];
		}
		int y = yy - 1;
		days = days + y * 365;
		days = days + (y / 400  + y / 4 - y / 100);
		return days;
	}
	static CountDate readDate()
	{
		Scanner s = new Scanner(System.in);
		int dd = s.nextInt();
		int mm = s.nextInt();
		int yy = s.nextInt();
		
		CountDate cd= new CountDate(dd, mm, yy);
		return cd;
	}
	
	public static void main(String[] args) {
		System.out.println("read the first date(dd/mm/yy) format: ");
		CountDate cd1 =readDate();
		System.out.println(cd1);
		System.out.println("enter the second date(dd/mm/yy)format: ");
		CountDate cd2 = readDate();
		System.out.println(cd2);
		System.out.println("the no of days is: " + (cd2.countDays() - cd1.countDays()));
		System.out.println("the no of years b/w is: " + ((cd2.countDays() - cd1.countDays())/365));	
	}
}
