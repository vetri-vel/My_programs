public class Student 
{
	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) 
	{
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	@Override
	public String toString()
	{
		return "[" + id + "," + name + "," + per + "]";
	}
	@Override
	public int hashCode() 
	{
		return id;
	}
	public boolean equals(Object o)
	{
		return this.hashCode()==o.hashCode();
	}
	
}
