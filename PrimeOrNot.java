// program to check whether the entered number is prime or not.

import java.util.Scanner;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;

		int den=2;

		for( ;den<=num;den++)
		{
			if(num%den==0)
			{
				break;
			}
		}
		if(temp==den)
		{
			System.out.println(+temp+" is a prime number.");
		}
		else
		{
            System.out.println(+temp+" is not a prime number.");
		}
	}
}
