/*

7.0 meter is 700.0 cm
7.0 meter is 0.007 km
7.0 meter is 22.96588 foot
7.0 meter is 274.82 inch
7.0 meter is 0.004350528 mile

*/

class LengthConverter 
{
	public static void main(String[] args) 
	{ 
		meterToCm(7);
		meterToKm(7);
		meterToFoot(7);
		meterToInch(7);
		meterToMile(7);	
	}
	public static void meterToCm(double meter)
	{
         float cm = (float)(meter*100);
		 System.out.println(meter+" meter is "+cm+" cm");
	}
	public static void meterToKm(double meter)
	{
         float km = (float)(meter/1000);
		 System.out.println(meter+" meter is "+km+" km");
	}
	public static void meterToFoot(double meter)
	{
         float foot = (float)(meter*3.28084);
		 System.out.println(meter+" meter is "+foot+" foot");
	}
	public static void meterToInch(double meter)
	{
         float inch = (float)(meter*39.26);
		 System.out.println(meter+" meter is "+inch+" inch");
	}
	public static void meterToMile(double meter)
	{
         float mile = (float)(meter/1609);
		 System.out.println(meter+" meter is "+mile+" mile");
	}
	
	
}
