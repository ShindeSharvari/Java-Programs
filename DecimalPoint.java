/*

Enter the number
125575.86078
Enter the number of decimal positions
2
125575.86

*/

import java.util.Scanner;
class DecimalPoint 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		double ip = sc.nextDouble();


		System.out.println("Enter the number of decimal positions");
		int no = sc.nextInt();

        System.out.println(reduceDecimalValue(ip,no));

	}

	public static double reduceDecimalValue(double ip,int no)
	{
		ip = ip * power(10,no);
		ip = (int)ip;
		ip = ip/power(10,no);
		return ip;
	}

	public static int power(int base , int raise)
	{
		int pow = 1;
		for(int i = 0; i<raise ;i++)
		{
			pow*=base;
		}
		return pow ;
	}
}
