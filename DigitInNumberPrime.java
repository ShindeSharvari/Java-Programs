// Check entered number contains any prime digit or not.

import java.util.Scanner;
class DigitInNumberPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");  // Taking number from user.
		int num = sc.nextInt();
       
               for( int temp=num;temp>0;temp/=10)
		{
		   int divisor=2;
		   int rem=temp%10;                     // Extracting number
		   for(;divisor<=rem;divisor++)         // checking extracted number is prime or not.
		    {
			if(rem%divisor==0)
			{
                           break;
			}
		    }
		  if(rem==divisor)                   
		  {
		    System.out.println(num+" contains a prime digit.");
		  } 
		}
	}
}
