import java.util.Scanner;

class FactorsSumCheck
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);

	   System.out.print("Enter the number: ");
	   int num = sc.nextInt();
	   int sum=0;

	   for(int i=1 ; i<num ;i++)
		{
		   if(num%i==0)
			{
			   sum+=i;
			}
		}
		if(sum==num)
		{
		  System.out.println("The sum of factors is equal to number itself");
		}
		else
		{
           System.out.println("The sum of factors is not equal to number itself");
		}
	}
}
