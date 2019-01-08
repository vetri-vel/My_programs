
import java.util.HashSet;
import java.util.Scanner;

public class Maint2 
{
	public static void main(String[] args) 
	{
		Student std = null,sr = null;
		Scanner s=new Scanner(System.in);
		HashSet hs = new HashSet();
		String res;
		do 
		{
			System.out.println("enter the student id name per:");
			int id = s.nextInt();
			String name =s.next();
			double per = s.nextDouble();
			std = new Student(id, name, per);
			
			hs.add(std);
			
			System.out.println("do  you have more students:");
			res = s.next();
		} while (res.equalsIgnoreCase("yes"));
		
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		
		System.out.println("enter the student id to search: ");
		int sid = s.nextInt();
		
		for (Object ob : hs) 
		{
			if(std.id == sid)
			{
				sr = (Student)std;
			}
		}
		System.out.println(sr);
		if(sr == null)
			System.out.println("not found record:  ");
		else
			System.out.println(sr);
	}
}
