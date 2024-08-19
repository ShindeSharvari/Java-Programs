import java.util.*;
class LaptopDriver 
{
	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop();
		l1.brand="HP";
		l1.price=45000.0;
		l1.processor="I5";
		l1.ram=8;
		l1.rom=16;
		l1.model="Pavillion";
		l1.color="Grey";
		l1.wt=1.7;

		System.out.println("Brand : "+l1.brand);
		System.out.println("Price : "+l1.price);
		System.out.println("Processor : "+l1.processor);
		System.out.println("Ram : "+l1.ram);
		System.out.println("Rom : "+l1.rom);
		System.out.println("Model : "+l1.model);
		System.out.println("Color : "+l1.color);
		System.out.println("Weight : "+l1.wt);
	}
}
