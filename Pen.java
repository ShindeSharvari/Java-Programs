class Pen 
{
	String brand;
	String mat;
	double cost;
	String color;

	//Refill r1 = new Refill("Blue",0.5,5,"Gel");
	Refill r1;

	Pen()
	{

	}

	//Pen(String brand , String mat , double price , String color)
	Pen(String brand , String mat , double price , String color , String rang, double tip , double cost , String type)
	{
		r1 = new Refill(rang , tip , cost , type);
		this.brand = brand;
		this.mat = mat;
		this.cost = price;
		this.color = color;

		System.out.println("Pen Created !");

	}

	public void displayPen()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Material: "+mat);
		System.out.println("Price: "+cost);
		System.out.println("Color: "+color);

	}
}
