/*

LCM - Least Common Multiplier

How to Find LCM by Listing Multiples
List the multiples of each number until at least one of the multiples appears on all lists
Find the smallest number that is on all of the lists
This number is the LCM
Example: LCM(6,7,21)

Multiples of 6: 6, 12, 18, 24, 30, 36, 42, 48, 54, 60
Multiples of 7: 7, 14, 21, 28, 35, 42, 56, 63
Multiples of 21: 21, 42, 63
Find the smallest number that is on all of the lists. We have it in bold above.
So LCM(6, 7, 21) is 42

*/

import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();

		System.out.println("Enter the second number:");
		int num2=sc.nextInt();

		int larger=num1>num2 ? num1:num2;

		for(int i=1; ;i++)  
		{
			if(larger*i%num1==0 && larger*i%num2==0)
			{
				System.out.println("The LCM of "+num1+ " and "+num2+" is : "+larger*i);
				break;
			}
		}

	}
}
