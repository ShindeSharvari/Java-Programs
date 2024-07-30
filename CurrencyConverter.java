/*

300.0 Rupees is 3.5825174 Dollar
300.0 Rupees is 3.3171163 Euro
300.0 Rupees is 310.5 Rubel
300.0 Rupees is 13.17 Diram

*/

class CurrencyConverter 
{
	public static void main(String[] args) 
	{
	   rupeeToDollar(300);
	   rupeeToEuro(300);
	   rupeeToRubel(300);
	   rupeeToDiram(300);
	}
	public static void rupeeToDollar(double rupee)
	{
         float dollar = (float)(rupee/83.74);
		 System.out.println(rupee+" Rupees is "+dollar+" Dollar");
	}
	public static void rupeeToEuro(double rupee)
	{
         float euro = (float)(rupee/90.44);
		 System.out.println(rupee+" Rupees is "+euro+" Euro");
	}
	public static void rupeeToRubel(double rupee)
	{
         float rubel = (float)(rupee*1.0350);
		 System.out.println(rupee+" Rupees is "+rubel+" Rubel");
	}
	public static void rupeeToDiram(double rupee)
	{
         float diram = (float)(rupee*0.0439);
		 System.out.println(rupee+" Rupees is "+diram+" Diram");
	}
}
