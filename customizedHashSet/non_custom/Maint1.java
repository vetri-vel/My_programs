import java.util.HashSet;
import java.util.Iterator;

public class Maint1 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet(6,0.65f);
		hs.add(new Student(123, "vetri", 90.98));
		hs.add(new Student(124, "vel", 90.58));
		hs.add(new Student(125, "viber", 90.12));
		hs.add(new Student(126, "velu", 90.34));
		hs.add(new Student(127, "raju", 90.33));
		hs.add(new Student(123, "vkjhg", 90.98));
		
		for(Object ob:hs)
		{
			System.out.println(ob);
		}	
	}
}
