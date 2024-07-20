/*

HCF/GCF : Highest Common Factor

Example: Find the GCF of 18 and 27
The factors of 18 are 1, 2, 3, 6, 9, 18.

The factors of 27 are 1, 3, 9, 27.

The common factors of 18 and 27 are 1, 3 and 9.

The greatest common factor of 18 and 27 is 9.

*/

import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();

		System.out.println("Enter the second number:");
		int num2=sc.nextInt();

		int small=num1<num2 ? num1:num2;

		for( ;small>0;small--)  
		{
			if(num1%small==0 && num2%small==0)
			{
				System.out.println("The HCF of "+num1+ " and "+num2+" is : "+small);
				break;
			}
		}
	}
}
