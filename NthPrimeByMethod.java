import java.util.Scanner;

class NthPrimeByMethod 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number: ");
	  int num = sc.nextInt();

	  System.out.println("The "+num+ " prime number is :"+nthPrime(num));

	}

	public static int nthPrime(int num)
	{
		int count = 0;
		int numToCheck = 2;
		while (true) 
		{
			if (isPrime(numToCheck)) 
			{
				count++;
				if (count == num) 
				{
					return numToCheck;
				}
			}
			numToCheck++;
		}
	}

	public static boolean isPrime(int num) 
	{
		if (num <= 1) 
		{
			return false;
		}
		for (int i = 2; i * i <= num; i++) 
		{
			if (num % i == 0) 
			{
				return false;
			}
		}
		return true;
	}
}