import java.util.Comparator;

public class BasedAge implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof Stu && o2 instanceof   Stu)
		{
			Stu s1 = (Stu)o1;
			Stu s2 = (Stu)o2;
			if(s1.age < s2.age)
				return 1;
			else
				return -1;
		}
		
		if(o1 instanceof Stu && o2 instanceof Emp)
		{
			Stu s1 = (Stu)o1;
			Emp s2 = (Emp)o2;
			if(s1.age < s2.age)
				return 1;
			else
				return -1;
		}
		
		if(o1 instanceof Emp  && o2 instanceof Stu)
		{
			Emp s1 = (Emp)o1;
			Stu s2 = (Stu)o2;
			if(s1.age < s2.age)
				return 1;
			else
				return -1;
		}
		
		if(o1 instanceof Emp && o2 instanceof Emp )
		{
			Emp s1 = (Emp)o1;
			Emp s2 = (Emp)o2;
			if(s1.age < s2.age)
				return 1;
			else
				return -1;
		}
		return 0;
	}
}
