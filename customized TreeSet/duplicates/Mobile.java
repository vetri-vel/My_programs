public class Mobile 
{
	int price;
	String model;
	String brand;
	
	public Mobile(int price, String model, String brand) 
	{
		this.price = price;
		this.model = model;
		this.brand = brand;
	}

	@Override
	public String toString() {
		
		return "[" + price + "," + model + "," + brand + "]";
	}
}
