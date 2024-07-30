/*

Multiplication : 127062
AamAdmiKaDivision : 1.4285715
ProgrammerKaDivison: 1
Subtraction : 40
Addition : 15
Subtraction : 32

*/

class Calculator 
{
	public static void main(String[] args) 
	{
		multiplication(234,543);
		aamAdmiKaDivision(10,7);
		programmerKaDivision(10,7);
		subtraction(100/2,20-10);
		addition(7,8);
		subtraction('a','A');
	}

	public static void addition(int num1,int num2)
	{
		int res = num1+num2;
		System.out.println("Addition : "+res);
	}

	public static void subtraction(int num1, int num2)
	{
		int res =  num1-num2;
		System.out.println("Subtraction : "+res);
	}

	public static void multiplication(int num1, int num2)
	{
		int res =  num1*num2;
		System.out.println("Multiplication : "+res);
	}

   public static void aamAdmiKaDivision(double num1, double num2)
	{
		float res =(float)(num1/num2);
		System.out.println("AamAdmiKaDivision : "+res);
	}

	public static void programmerKaDivision(int num1, int num2)
	{
		int res =  num1/num2;
		System.out.println("ProgrammerKaDivison: "+res);
	}
}
