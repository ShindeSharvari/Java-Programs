/* Write a java program to find whether the given integer number is Buzz number or not. 
Buzz number is a number that ends with digit 7 or divisible by 7.

Example: 42 is a Buzz number because it is divisible by 7. 107 is a Buzz number because it ends with 7.*/

import java.util.Scanner;
 
class Buzz
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		if(num%7==0 || num%10==7)
		{
			System.out.println(+num+" is a buzz number");
		}
		else
		{
           System.out.println(+num+" is a buzz number");
		}
	}
}
