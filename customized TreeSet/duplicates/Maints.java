
import java.util.Iterator;
import java.util.TreeSet;

public class Maints 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new BasedOnPrice());
		ts.add(new Mobile(8000,"x10","Apple"));
		ts.add(new Mobile(9000,"note9","samsung"));
		ts.add(new Mobile(12000,"9 lite","huawei"));
		ts.add(new Mobile(8000,"x10","Apple"));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	
}
