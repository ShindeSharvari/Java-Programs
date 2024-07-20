/*

Co-prime numbers are pairs of numbers that do not have any common factor other than 1.
There should be a minimum of two numbers to form a set of co-prime numbers. 
Such numbers have only 1 as their highest common factor, for example, (4 and 7), (5, 7, 9) are co-prime numbers.

*/
import java.util.Scanner;
class CoPrime
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
				break;
			}
		}
		if(small==1)
		{
			System.out.println("The entered numbers are co-prime numbers.");
		}
		else
		{
			System.out.println("The entered numbers are not co-prime numbers.");
		}
	}
}
