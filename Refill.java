class Refill 
{
	String color;
	double tip;
	double price;
	String type;

	Refill()
	{

	}
   
    Refill(String color,double tip,double price,String type)
	{
		this.color = color;
		this.tip = tip;
		this.price = price;
		this.type = type;

		System.out.println("Refill Created !");
	}

	public void showRefill()
	{
		System.out.println("Color: "+color);
		System.out.println("Tip: "+tip);
		System.out.println("Price: "+price);		
		System.out.println("Type: "+type);
		System.out.println("--------------------------");

	}
}
