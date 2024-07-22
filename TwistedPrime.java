// Check given number is prime if prime check its reverse number is prime if yes then print twisted number

import java.util.Scanner;
class TwistedPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number : ");  // Taking number from user.
		int num = sc.nextInt();
        int den,den2;

		for(den=2 ;den<=num;den++)         // Here we started dividing numb by 2 until that number to satisfy prime condition.
		{
		    if(num%den==0)
			{
			   break;
			}
		}	 

	    if(num==den)                    // If number and den are same it means number is prime , hence next process will start.
		{
          int reverse=0;
		  int i=num;
		  for(;i>0;i/=10)             // Reversing number
			{
			  int rem=i%10;
			  reverse=(reverse*10)+rem;
			 }

          for(den2=2;den2<=reverse;den2++)    // Checking reverse number is prime or not.
			{
			  if(reverse%den2==0)
				{
				  break;
				}
			}
			if(reverse==den2)               // Checking reverse and den2 is equal for prime .
			{
              System.out.println(num+" is a twisted prime number.");
			}
			else
			{
				System.out.println(num+" is not a twisted prime number.");
			}
		}
		else
		{
			System.out.println(num+" is not prime.");
		}
	}
}