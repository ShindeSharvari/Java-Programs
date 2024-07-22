/* 

// Check entered number are twin prime number or not.

Two prime numbers are called twin primes if there is present only one composite number between them.
Or we can also say two prime numbers whose difference is two are called twin primes. For example, (3,5) are twin primes,
since the difference between the two numbers 5 – 3 = 2.

*/
import java.util.Scanner;
class TwinPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1=sc.nextInt();

		System.out.print("Enter the Second number : ");
		int num2=sc.nextInt();

		int divisor,divisor2;
		for(divisor=2;divisor<=num1;divisor++)   // Checking num1 is prime or not.
		{
			if(num1%divisor==0)
			{
				break;
			}

		}
		if(num1==divisor)                   // If num1 is prime then check num2 prime or not
		{
		   for(divisor2=2;divisor2<=num2;divisor2++)
		   {
			  if(num2%divisor2==0)
			  {
				break;
			  }
		   }
		   if(num2==divisor2)
		   {
			 if(num1==divisor && num2==divisor2)
		     {
			   int difference = num2-num1;
			   if(difference==2)
			   {
				 System.out.println(num1+" and "+num2+ " are twin Prime Numbers");
			   }
			   else
			   {
                  System.out.println(num1+" and "+num2+ " are not a twin Prime Numbers");
			   }
		     }
	       }
		  else
		  {
            System.out.println(num2+" is not a prime number.");
		  }
	   }
	   else
		{
           System.out.println(num1+" is not a prime number.");
		}
	}
}
