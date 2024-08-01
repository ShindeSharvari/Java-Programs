import java.util.Scanner;

class PalindromeByMethod 
{
	public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();

	  if(reverse(num)==num)
	  {
		 System.out.println(num+" is a palindrome number");
	  }
	  else
	  {
			System.out.println(num+" is not a palindrome number");
   	  }

	}

	public static int reverse(int num)
	{
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}

		return rev;
	}
}
