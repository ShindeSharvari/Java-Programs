class LaptopDriver2 
{
	public static void main(String[] args) 
	{
		Laptop2 l1 = new Laptop2();

		l1.brand="HP";
		l1.price=45000.0;
		l1.processor="I5";
		l1.ram=8;
		l1.rom=16;
		l1.model="Pavillion";
		l1.color="Grey";
		l1.wt=1.7;

		l1.laptopInfo();

		Laptop2 l2 = new Laptop2();

		l2.brand="Lenevo";
		l2.price=70000.0;
		l2.processor="I7";
		l2.ram=32;
		l2.rom=1;
		l2.model="Idea Pad";
		l2.color="Black";
		l2.wt=2;

		l2.laptopInfo();

	}
}
