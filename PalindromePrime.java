// check number is palindrome prime.

import java.util.Scanner;

class PalindromePrime
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int rem=0,reverse=0;
		int temp=num;
		while(num>0)     // Reverse number 
		{
			rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
		}
		if(temp==reverse)  // if this true then it is palindrome number
		{
          int divisor=2;
		  while(divisor<=reverse)   // checking for prime.
			{
			  if(reverse%divisor==0)
				{
				  break;
				}
				divisor++;
			}
			if(divisor==reverse)  
			{
             System.out.println("The entered number is palindrome prime  number");
			}
			else
			{
				System.out.println("The entered number is palindrome but not prime number");
			}
		}
		else
		{
		   System.out.println("The entered number is not a palindrome number");
        }
	}
}
