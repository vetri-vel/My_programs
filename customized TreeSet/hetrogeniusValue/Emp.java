
public class Emp 
{
	String name;
	int age;
	
	public Emp(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "[" + name + "," + age + "]";
	}
}
