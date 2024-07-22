// Check in given range number is prime if prime check its reverse number is prime if yes then print twisted numbers in that range.

import java.util.Scanner;
class TwistedPrimeInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number : ");  // Taking number from user.
		int start = sc.nextInt();

        System.out.print("Enter the end number : ");  // Taking number from user.
		int end= sc.nextInt();

        int den,den2;
		while(start<=end)
		{

		for(den=2 ;den<=start;den++)         // Here we started dividing numb by 2 until that number to satisfy prime condition.
		{
		    if(start%den==0)
			{
			   break;
			}
		}	 

	    if(start==den)                    // If number and den are same it means number is prime , hence next process will start.
		{
          int reverse=0;
		  int i=start;
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
              System.out.println(start);
			}
		}
		start++;
		}
	}
}