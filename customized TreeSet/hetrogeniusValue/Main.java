import java.util.Iterator;
import java.util.TreeSet;

public class Main 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new BasedAge());
		ts.add(new Stu("vetri", 23));
		ts.add(new Emp("vetri", 23));
		ts.add(new Stu("viber", 22));
		ts.add(new Emp("viber", 22));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
