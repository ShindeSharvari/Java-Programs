// Give the count of prime number present in the given range and check if the count is prime or not.

import java.util.Scanner;
class PrimeCountPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number : ");
		int start = sc.nextInt();

		System.out.print("Enter the end number : ");
		int end = sc.nextInt();
		int count=0;
        
		for(int num=start ;num<=end ;num++)
		{
			int den;
			for(den=2;den<=num;den++)
			 {
			   if(num%den==0)
			    {
				   break;
			    }
			 }
			 if(num==den)
			{
				 count++;
			}
		}
		System.out.println("Prime number count in given range = "+count );
		int divisor=2;
		for(;divisor<=count;divisor++)
		{
			if(count%divisor==0)
			{
				break;
			}
		}
		if(count==divisor)
		{
			System.out.println("The count of prime number in given range is prime.");
		}
		else
		{
            System.out.println("The count of prime number in given range is not prime.");
		}
	}
}
