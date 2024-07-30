/*

 Area of triangle is : 10.5
 Area of square is : 36.0
 Area of rectangle is : 27.0
 Circumference of circle is : 78.5
 Area of cube is : 64.0

 */

class Areas 
{
	public static void main(String[] args) 
	{ 
		areaOfTriangle(3,7);
		areaOfSquare(6);
		areaOfRectangle(4.5,6);
		circumferenceOfCircle(5);
		areaOfCube(4);
	}
	public static void areaOfTriangle(double base, double height)
	{
         float area = (float)(0.5*base*height);
		 System.out.println(" Area of triangle is : "+area);
	}

	public static void areaOfSquare(double side)
	{
         float area = (float)(side*side);
		 System.out.println(" Area of square is : "+area);
	}

	public static void areaOfRectangle(double length, double width)
	{
         float area = (float)(length * width);
		 System.out.println(" Area of rectangle is : "+area);
	}

	public static void circumferenceOfCircle(double radius)
	{
         float area = (float)(3.14*(radius*radius));
		 System.out.println(" Circumference of circle is : "+area);
	}

	public static void areaOfCube(double side)
	{
         float area = (float)(side*side*side);
		 System.out.println(" Area of cube is : "+area);
	}
}