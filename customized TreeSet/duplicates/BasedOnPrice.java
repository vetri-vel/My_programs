import java.util.Comparator;

public class BasedOnPrice implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1 = (Mobile)o1;
		Mobile m2 = (Mobile)o2;
		if(m1.price>m2.price)
			return -1;
		else
			return 1;
	}
}
